package com.jxd.mybatisPlus.model;

/**
 * @Description:
 * @date: 2020/10/30
 * @author: Yan XiaoZhi
 */
public class Menu {
    private int id;
    private String path;//路径
    private String name;//英文名字
    private String nameZh;//中文名字
    private String component;
    private String iconCls;//图标
    private int parentId;

    public Menu(int id, String path, String name, String nameZh, String component, String iconCls, int parentId) {
        this.id = id;
        this.path = path;
        this.name = name;
        this.nameZh = nameZh;
        this.component = component;
        this.iconCls = iconCls;
        this.parentId = parentId;
    }

    public Menu() {
    }

    public int getId() {
        return id;
    }

    public String getPath() {
        return path;
    }

    public String getName() {
        return name;
    }

    public String getNameZh() {
        return nameZh;
    }

    public String getComponent() {
        return component;
    }

    public String getIconCls() {
        return iconCls;
    }

    public int getParentId() {
        return parentId;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNameZh(String nameZh) {
        this.nameZh = nameZh;
    }

    public void setComponent(String component) {
        this.component = component;
    }

    public void setIconCls(String iconCls) {
        this.iconCls = iconCls;
    }

    public void setParentId(int parentId) {
        this.parentId = parentId;
    }
}
