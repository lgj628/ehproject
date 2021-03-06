package org.ehais.controller.admin;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.ehais.common.Constants;
import org.ehais.controller.CommonController;
import org.ehais.model.EHaiArticleCat;
import org.ehais.model.TreeModel;
import org.ehais.service.EArticleCatService;
import org.ehais.tools.ReturnObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/admin")
public class  EArticleCatController extends CommonController {

	private static Logger log = LoggerFactory.getLogger(EArticleCatController.class);

	@Autowired
	private EArticleCatService eArticlecatService;
	
	
	@RequestMapping("/e_articlecat_list")
	public String articlecat_list(ModelMap modelMap,
			HttpServletRequest request,HttpServletResponse response ) {	
		Integer user_id = (Integer)request.getSession().getAttribute(Constants.SESSION_USER_ID);
		try{
			modelMap.addAttribute("wxid", user_id);
			modelMap.addAttribute("action", "e_articlecat_list_json");
		}catch(Exception e){
			e.printStackTrace();
			log.error("articlecat", e);
		}
		return "/admin/eArticleCat/list";
	}
	
	@ResponseBody
	@RequestMapping("/e_articlecat_list_json")
	public String articlecat_list_json(ModelMap modelMap,
			HttpServletRequest request,HttpServletResponse response,
			@RequestParam(value = "page", required = true) Integer page,
			@RequestParam(value = "len", required = true) Integer len) {
		try{
			ReturnObject<TreeModel> rm = eArticlecatService.articlecat_tree_json(request, page, len);
			return this.writeJson(rm);
		}catch(Exception e){
			e.printStackTrace();
			log.error("articlecat", e);
		}
		return null;
	}
	
	

	@RequestMapping("/e_articlecat_insert")
	public String articlecat_insert(ModelMap modelMap,
			HttpServletRequest request,HttpServletResponse response
			) {
		try{
			ReturnObject<EHaiArticleCat> rm = eArticlecatService.articlecat_insert(request);
			rm.setAction("e_articlecat_insert_submit");
			modelMap.addAttribute("rm", rm);
		}catch(Exception e){
			e.printStackTrace();
			log.error("articlecat", e);
		}
		return "/admin/eArticleCat/info";
	}
	
	@RequestMapping(value="/e_articlecat_insert_submit",method=RequestMethod.POST)
	public String articlecat_insert_submit(ModelMap modelMap,
			HttpServletRequest request,HttpServletResponse response,
			@ModelAttribute EHaiArticleCat articlecat
			) {
		try{
			ReturnObject<EHaiArticleCat> rm = eArticlecatService.articlecat_insert_submit(request,articlecat);
			return this.ReturnJump(modelMap, rm.getCode(), rm.getMsg(), "e_articlecat_insert");
		}catch(Exception e){
			e.printStackTrace();
			log.error("articlecat", e);
		}
		return "redirect:e_articlecat_insert";
	}
	
	@RequestMapping("/e_articlecat_update")
	public String articlecat_update(ModelMap modelMap,
			HttpServletRequest request,HttpServletResponse response,
			@RequestParam(value = "catId", required = true) Integer catId
			) {
		try{
			ReturnObject<EHaiArticleCat> rm = eArticlecatService.articlecat_update(request, catId);
			rm.setAction("e_articlecat_update_submit");
			modelMap.addAttribute("rm", rm);
		}catch(Exception e){
			e.printStackTrace();
			log.error("articlecat", e);
		}
		return "/admin/eArticleCat/info";
	}
	
	@RequestMapping(value="/e_articlecat_update_submit",method=RequestMethod.POST)
	public String articlecat_update_submit(ModelMap modelMap,
			HttpServletRequest request,HttpServletResponse response,
			@ModelAttribute EHaiArticleCat articlecat
			) {
		try{
			ReturnObject<EHaiArticleCat> rm = eArticlecatService.articlecat_update_submit(request,articlecat);
			return this.ReturnJump(modelMap, rm.getCode(), rm.getMsg(), "e_articlecat_list");
		}catch(Exception e){
			e.printStackTrace();
			log.error("articlecat", e);
		}
		return "/admin/eArticleCat/info";
	}
	
	
	@RequestMapping("/e_articlecat_delete")
	public String articlecat_delete(ModelMap modelMap,
			HttpServletRequest request,HttpServletResponse response,
			@RequestParam(value = "catId", required = false) Integer catId,
			@RequestParam(value = "code", required = false) String code
			) {
		try{
			ReturnObject<EHaiArticleCat> rm = eArticlecatService.articlecat_delete(request, catId);
			return this.ReturnJump(modelMap, rm.getCode(), rm.getMsg(), "e_articlecat_list");
		}catch(Exception e){
			e.printStackTrace();
			log.error("articlecat", e);
		}
		return null;
	}
	
	
}


