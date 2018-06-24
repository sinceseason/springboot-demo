package com.example.demo.model;

import com.example.demo.base.model.BaseModel;
import org.hibernate.validator.constraints.NotBlank;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Transient;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "menu")
public class Menu extends BaseModel {

    @NotBlank
    @Column(name = "main")
    private String main;

    @NotBlank
    @Column(name = "parentId")
    private Integer parentId;

    @NotBlank
    @Column(name = "type")
    private Integer type;

    @Column(name = "menuId")
    private Integer menuId;

    @Column(name = "router")
    private String router;

    @Column(name = "icon")
    private String icon;

    @Transient
    private List<Menu> subMenu = new ArrayList<>();

    public String getMain() {
        return main;
    }

    public void setMain(String main) {
        this.main = main;
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public List<Menu> getSubMenu() {
        return subMenu;
    }

    public void setSubMenu(List<Menu> subMenu) {
        this.subMenu = subMenu;
    }

    public Integer getMenuId() {
        return menuId;
    }

    public void setMenuId(Integer menuId) {
        this.menuId = menuId;
    }

    public String getRouter() {
        return router;
    }

    public void setRouter(String router) {
        this.router = router;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }
}
