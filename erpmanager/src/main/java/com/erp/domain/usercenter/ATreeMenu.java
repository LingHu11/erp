package com.erp.domain.usercenter;

import lombok.Data;

import java.util.List;

@Data
public class ATreeMenu {

    private String id;

    private String pid;

    private String title;

    private String field;

    private List<ATreeMenu> children;

    private boolean spread = true;

    private boolean checkbox = true;

    private boolean disabled = false;
}
