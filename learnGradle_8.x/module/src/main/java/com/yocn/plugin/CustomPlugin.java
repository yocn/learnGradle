package com.yocn.plugin;

import org.gradle.api.Plugin;
import org.gradle.api.Project;

public class CustomPlugin implements Plugin<Project> {
    @Override
    public void apply(Project target) {
        System.out.println("CustomPlugin apply: $target");
    }
}
