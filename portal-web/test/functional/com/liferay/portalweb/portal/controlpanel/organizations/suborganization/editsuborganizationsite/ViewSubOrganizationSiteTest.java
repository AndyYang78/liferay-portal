/**
 * Copyright (c) 2000-2013 Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.portalweb.portal.controlpanel.organizations.suborganization.editsuborganizationsite;

import com.liferay.portalweb.portal.BaseTestCase;
import com.liferay.portalweb.portal.util.RuntimeVariables;

/**
 * @author Brian Wing Shun Chan
 */
public class ViewSubOrganizationSiteTest extends BaseTestCase {
	public void testViewSubOrganizationSite() throws Exception {
		selenium.selectWindow("null");
		selenium.selectFrame("relative=top");
		selenium.open("/web/guest/home/");
		selenium.clickAt("//div[@id='dockbar']",
			RuntimeVariables.replace("Dockbar"));
		selenium.waitForElementPresent(
			"//script[contains(@src,'/aui/aui-editable/aui-editable-min.js')]");
		assertEquals(RuntimeVariables.replace("Go to"),
			selenium.getText("//li[@id='_145_mySites']/a/span"));
		selenium.mouseOver("//li[@id='_145_mySites']/a/span");
		selenium.waitForVisible("link=Control Panel");
		selenium.clickAt("link=Control Panel",
			RuntimeVariables.replace("Control Panel"));
		selenium.waitForPageToLoad("30000");
		selenium.clickAt("link=Sites", RuntimeVariables.replace("Sites"));
		selenium.waitForPageToLoad("30000");
		selenium.type("//input[@name='_134_keywords']",
			RuntimeVariables.replace("Suborganization"));
		selenium.clickAt("//input[@value='Search']",
			RuntimeVariables.replace("Search"));
		selenium.waitForPageToLoad("30000");
		assertFalse(selenium.isChecked(
				"//tr[@class='portlet-section-header results-header']/th[1]/input"));
		assertEquals(RuntimeVariables.replace("Name"),
			selenium.getText(
				"//tr[@class='portlet-section-header results-header']/th[2]"));
		assertEquals(RuntimeVariables.replace("Type"),
			selenium.getText(
				"//tr[@class='portlet-section-header results-header']/th[3]"));
		assertEquals(RuntimeVariables.replace("Members"),
			selenium.getText(
				"//tr[@class='portlet-section-header results-header']/th[4]"));
		assertEquals(RuntimeVariables.replace("Active"),
			selenium.getText(
				"//tr[@class='portlet-section-header results-header']/th[5]"));
		assertEquals(RuntimeVariables.replace("Pending Requests"),
			selenium.getText(
				"//tr[@class='portlet-section-header results-header']/th[6]"));
		assertEquals(RuntimeVariables.replace("Tags"),
			selenium.getText(
				"//tr[@class='portlet-section-header results-header']/th[7]"));
		assertEquals(RuntimeVariables.replace(""),
			selenium.getText(
				"//tr[@class='portlet-section-header results-header']/th[8]"));
		assertFalse(selenium.isChecked(
				"//tr[contains(.,'Suborganization Name')]/td[1]/input"));
		assertEquals(RuntimeVariables.replace("Suborganization Name"),
			selenium.getText("//tr[contains(.,'Suborganization Name')]/td[2]/a"));
		assertEquals(RuntimeVariables.replace("Private"),
			selenium.getText("//tr[contains(.,'Suborganization Name')]/td[3]/a"));
		assertEquals(RuntimeVariables.replace("1 Organization"),
			selenium.getText("//tr[contains(.,'Suborganization Name')]/td[4]"));
		assertEquals(RuntimeVariables.replace("Yes"),
			selenium.getText("//tr[contains(.,'Suborganization Name')]/td[5]"));
		assertEquals(RuntimeVariables.replace(""),
			selenium.getText("//tr[contains(.,'Suborganization Name')]/td[6]"));
		assertEquals(RuntimeVariables.replace(""),
			selenium.getText("//tr[contains(.,'Suborganization Name')]/td[7]"));
		assertEquals(RuntimeVariables.replace("Actions"),
			selenium.getText(
				"//tr[contains(.,'Suborganization Name')]/td[8]/span[@title='Actions']/ul/li/strong/a/span"));
		selenium.clickAt("//tr[contains(.,'Suborganization Name')]/td[2]/a",
			RuntimeVariables.replace("Suborganization Name"));
		selenium.waitForPageToLoad("30000");
		assertEquals(RuntimeVariables.replace("Sites"),
			selenium.getText("//h1[@class='portlet-title']/span"));
		assertEquals(RuntimeVariables.replace("Browse"),
			selenium.getText(
				"//div[@class='lfr-portlet-toolbar']/span/a[contains(.,'Browse')]"));
		assertEquals(RuntimeVariables.replace("View All"),
			selenium.getText(
				"//div[@class='lfr-portlet-toolbar']/span/a[contains(.,'View All')]"));
		assertEquals(RuntimeVariables.replace("Add"),
			selenium.getText(
				"//div[@class='lfr-portlet-toolbar']/span/ul/li/strong/a[contains(.,'Add')]"));
		assertEquals(RuntimeVariables.replace("Suborganization Name"),
			selenium.getText("//h1[@class='header-title']/span"));
		assertEquals(RuntimeVariables.replace(
				"\u00ab Back to Organization Name"),
			selenium.getText("//span[@class='header-back-to']/a"));
		assertEquals(RuntimeVariables.replace("Members:"),
			selenium.getText("//div[@class='membership-info']/dl/dt[1]"));
		assertEquals(RuntimeVariables.replace("1 Organization"),
			selenium.getText("//div[@class='membership-info']/dl/dd[1]"));
		assertEquals(RuntimeVariables.replace("Membership Type:"),
			selenium.getText("//div[@class='membership-info']/dl/dt[2]"));
		assertEquals(RuntimeVariables.replace("Private"),
			selenium.getText("//div[@class='membership-info']/dl/dd[2]"));
		assertTrue(selenium.isVisible("//div[@class='lfr-asset-summary']/img"));
		assertEquals(RuntimeVariables.replace("Suborganization Name"),
			selenium.getText("//div[@class='lfr-asset-summary']/div/h4"));
		assertEquals(RuntimeVariables.replace("Edit Settings"),
			selenium.getText(
				"//div[@class='lfr-component lfr-menu-list lfr-menu-expanded align-right null']/ul/li/a[contains(.,'Edit Settings')]"));
		assertEquals(RuntimeVariables.replace("Manage Pages"),
			selenium.getText(
				"//div[@class='lfr-component lfr-menu-list lfr-menu-expanded align-right null']/ul/li/a[contains(.,'Manage Pages')]"));
		assertEquals(RuntimeVariables.replace("Manage Memberships"),
			selenium.getText(
				"//div[@class='lfr-component lfr-menu-list lfr-menu-expanded align-right null']/ul/li/a[contains(.,'Manage Memberships')]"));
		assertEquals(RuntimeVariables.replace("Deactivate"),
			selenium.getText(
				"//div[@class='lfr-component lfr-menu-list lfr-menu-expanded align-right null']/ul/li/a[contains(.,'Deactivate')]"));
		assertEquals(RuntimeVariables.replace("Delete"),
			selenium.getText(
				"//div[@class='lfr-component lfr-menu-list lfr-menu-expanded align-right null']/ul/li/a[contains(.,'Delete')]"));
		assertEquals(RuntimeVariables.replace("Add Blank Site"),
			selenium.getText(
				"//div[@class='lfr-component lfr-menu-list lfr-menu-expanded align-right null']/ul/li/a[contains(.,'Add Blank Site')]"));
		assertEquals(RuntimeVariables.replace("Add Community Site"),
			selenium.getText(
				"//div[@class='lfr-component lfr-menu-list lfr-menu-expanded align-right null']/ul/li/a[contains(.,'Add Community Site')]"));
		assertEquals(RuntimeVariables.replace("Add Intranet Site"),
			selenium.getText(
				"//div[@class='lfr-component lfr-menu-list lfr-menu-expanded align-right null']/ul/li/a[contains(.,'Add Intranet Site')]"));
	}
}