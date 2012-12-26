/*
 * Copyright 2008-2012 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.ZeClouds.admin.controller;

import org.broadleafcommerce.openadmin.web.controller.BroadleafAdminLoginController;
import org.broadleafcommerce.openadmin.web.form.ResetPasswordForm;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
/**
 * AdminLoginController handles login related needs for the BLC admin including:
 * <ul>
 *     <li>Forgot Password</li>
 *     <li>Forgot Username</li>
 *     <li>Reset Password</li>
 * </ul>
 *
 */
public class AdminLoginController extends BroadleafAdminLoginController {
			
		
		@RequestMapping(value="/blcadmin")
		public String login(HttpServletRequest request, HttpServletResponse response, Model model) {
			return super.login(request, response, model);
		}

		@RequestMapping(value="/blcadmin/login", method=RequestMethod.GET)
		public String baseLogin(HttpServletRequest request, HttpServletResponse response, Model model) {
			return super.login(request, response, model);
		}
		@RequestMapping(value="/blcadmin/forgotPassword", method=RequestMethod.GET)
		public String forgotPassword(HttpServletRequest request, HttpServletResponse response, Model model) {
			return super.forgotPassword(request, response, model);
		}
		@RequestMapping(value="/blcadmin/forgotUsername", method=RequestMethod.GET)
	    public String forgotUsername(HttpServletRequest request, HttpServletResponse response,Model model) {
	    	return super.forgotUsername(request, response, model);
	    } 
		@RequestMapping(value="/blcadmin/forgotUsername", method=RequestMethod.POST)
	    public String processForgotUserName(@RequestParam("emailAddress") String emailAddress, HttpServletRequest request, Model model) {
	    	return super.processForgotUserName(emailAddress, request, model);
	    }   

		@RequestMapping(value="/blcadmin/resetPassword", method=RequestMethod.GET)
		public String resetPassword(HttpServletRequest request, HttpServletResponse response, Model model) {
			return super.resetPassword(request, response, model);
		}	
	    
		@RequestMapping(value="/blcadmin/resetPassword", method=RequestMethod.POST)
	    public String processResetPassword(@ModelAttribute("resetPasswordForm") ResetPasswordForm resetPasswordForm, HttpServletRequest request, HttpServletResponse response, Model model) {
	    	return super.resetPassword(resetPasswordForm, request);
	    }	
		@RequestMapping(value="/blcadmin/changePassword", method=RequestMethod.GET)
		public String changePassword(HttpServletRequest request, HttpServletResponse response, Model model) {
			return super.changePassword(request, response, model);
		}	
	    
		@RequestMapping(value="/blcadmin/changePassword", method=RequestMethod.POST)
	    public String processchangePassword(@ModelAttribute("resetPasswordForm") ResetPasswordForm resetPasswordForm, HttpServletRequest request, HttpServletResponse response, Model model) {
	    	return super.processChangePassword(resetPasswordForm, request);
	    }	

	}