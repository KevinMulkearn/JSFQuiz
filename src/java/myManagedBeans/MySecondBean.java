/*
 * Web Based Application Design (EE6052) Project 1
 * Kevin Mulkearn
 * 11124725
 */
package myManagedBeans;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

/**
 *
 * @author Kevin Mulkearn
 */
@ManagedBean
@ApplicationScoped
public class MySecondBean {

    /**
     * Variable declarations
     */
    
    // counters
    private int totalHits = 1;          // index hits
    private int hits = 1;               // index hits
    private int accessingHits = 1;      // accessing.xhtml
    private int navigationHits = 1;     // navigation.xhtml
    private int processingHits = 1;     // processing.xhtml
    private int scopesHits = 1;         // scopes.xhtml
    private int tablesHits = 1;         // tables.xhtml
    private int validatorsHits = 1;     // validators.xhtml
    private int quizHits = 1;           // quiz.xhtml

    /**
     * Creates a new instance of MyThirdBean
     */
    public MySecondBean() {
    }

    /**
     * Getters
     */
    
    // Increment and return the number of hits
    public int getTotalHits() {
        return totalHits++;
    }

    public int getHits() {
        return hits++;
    }

    public int getAccessingHits() {
        return accessingHits++;
    }

    public int getNavigationHits() {
        return navigationHits++;
    }

    public int getProcessingHits() {
        return processingHits++;
    }

    public int getScopesHits() {
        return scopesHits++;
    }

    public int getTablesHits() {
        return tablesHits++;
    }

    public int getValidatorsHits() {
        return validatorsHits++;
    }

    public int getQuizHits() {
        return quizHits++;
    }

}
