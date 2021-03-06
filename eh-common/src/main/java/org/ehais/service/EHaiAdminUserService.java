package org.ehais.service;

import javax.servlet.http.HttpServletRequest;

import org.ehais.model.EHaiAdminUser;
import org.ehais.model.EHaiAdminUserWithBLOBs;
import org.ehais.tools.ReturnObject;



public interface EHaiAdminUserService extends CommonService{
	public ReturnObject<EHaiAdminUser> EHaiAdminUser_list(HttpServletRequest request) throws Exception;
	public ReturnObject<EHaiAdminUser> EHaiAdminUser_list_json(HttpServletRequest request,Integer page,Integer len) throws Exception;
	public ReturnObject<EHaiAdminUserWithBLOBs> EHaiAdminUser_insert(HttpServletRequest request) throws Exception;
	public ReturnObject<EHaiAdminUserWithBLOBs> EHaiAdminUser_insert_submit(HttpServletRequest request,EHaiAdminUserWithBLOBs model) throws Exception;
	public ReturnObject<EHaiAdminUserWithBLOBs> EHaiAdminUser_update(HttpServletRequest request,Integer key) throws Exception;
	public ReturnObject<EHaiAdminUserWithBLOBs> EHaiAdminUser_update_submit(HttpServletRequest request,EHaiAdminUserWithBLOBs model) throws Exception;
	public ReturnObject<EHaiAdminUserWithBLOBs> EHaiAdminUser_find(HttpServletRequest request,Integer key) throws Exception;
	public ReturnObject<EHaiAdminUser> EHaiAdminUser_delete(HttpServletRequest request,Integer key) throws Exception;
	
	public ReturnObject<EHaiAdminUser> login_admin(HttpServletRequest request,String username,String password) throws Exception;
	

	public ReturnObject<EHaiAdminUser> logout_admin(HttpServletRequest request) throws Exception;
	
	
}

