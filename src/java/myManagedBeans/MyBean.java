/*
 * Web Based Application Design (EE6052) Project 1
 * Kevin Mulkearn
 * 11124725
 */
package myManagedBeans;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author Kevin Mulkearn
 */
@ManagedBean(name = "myBean")
@RequestScoped
public class MyBean {

    /**
     * Variable declarations
     */
    private String currentPage;
    public String data = "null";

    /**
     * Creates a new instance of MyBean
     */
    public MyBean() {
        currentPage = "Home Page";
    }

    /**
     * Getters
     */
    public String getCurrentPage() {
        return currentPage;
    }

    public String getData() {
        return data;
    }

    /**
     * Setters
     */
    public void setCurrentPage(String currentPage) {
        this.currentPage = currentPage;
    }

    public void setData(String data) {
        this.data = data;
    }

    // Returns a value for a navigation case
    public String processPage() {
        return currentPage;
    }

}
