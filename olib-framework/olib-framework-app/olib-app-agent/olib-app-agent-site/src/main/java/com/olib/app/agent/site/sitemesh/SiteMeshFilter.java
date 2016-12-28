package com.olib.app.agent.site.sitemesh;

import org.sitemesh.builder.SiteMeshFilterBuilder;
import org.sitemesh.config.ConfigurableSiteMeshFilter;
import org.sitemesh.content.tagrules.html.Sm2TagRuleBundle;

public class SiteMeshFilter extends ConfigurableSiteMeshFilter {

	@Override
	protected void applyCustomConfiguration(SiteMeshFilterBuilder builder) {
		builder.addExcludedPath("/login");
		builder.addExcludedPath("/json/*");
		builder.addTagRuleBundle(new Sm2TagRuleBundle());
		builder.addDecoratorPath("/*", "/decorator.html");
	}
}