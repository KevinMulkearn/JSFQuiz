/*
 * Web Based Application Design (EE6052) Project 1
 * Kevin Mulkearn
 * 11124725
 */
package myManagedBeans;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author Kevin Mulkearn
 */
@ManagedBean
@SessionScoped
public class MyThirdBean {

    /**
     * Variable declarations
     */
    
    // user name
    private String name;

    // submitted answers
    public String data1 = "null";
    public String data2 = "null";
    public String data3 = "null";
    public String data4 = "null";
    public String data5 = "null";
    public String data6 = "null";
    public String data7 = "null";
    public String data8 = "null";
    public String data9 = "null";
    public String data10 = "null";

    // quiz answers
    public String q1 = "4.6 Million";
    public String q2 = "32";
    public String q3 = "Dublin";
    public String q4 = "James Joyce";
    public String q5 = "Ireland Forever";
    public String q6 = "Easter";
    public String q7 = "Michael D. Higgins";
    public String q8 = "Euro";
    public String q9 = "7";
    public String q10 = "Green, White, and Orange";

    /**
     * Creates a new instance of MyThirdBean
     */
    public MyThirdBean() {
    }

    /**
     * Getters
     */
    
    // return user name
    public String getName() {
        return name;
    }
//////////////////////////////////////////////////////////////////////////////  

    // return selected quiz answer
    public String getData1() {
        return data1;
    }

    public String getData2() {
        return data2;
    }

    public String getData3() {
        return data3;
    }

    public String getData4() {
        return data4;
    }

    public String getData5() {
        return data5;
    }

    public String getData6() {
        return data6;
    }

    public String getData7() {
        return data7;
    }

    public String getData8() {
        return data8;
    }

    public String getData9() {
        return data9;
    }

    public String getData10() {
        return data10;
    }

////////////////////////////////////////////////////////////////////////////// 
    
    // return correct/incorrect result
    public String getQ1() {
        String C_ans = "Correct !!";
        String I_ans = "Incorrect !!! The correct answer is: 4.6 Million";

        if (q1.equals(data1)) {
            return C_ans;
        } else {
            return I_ans;
        }
    }

    public String getQ2() {
        String C_ans = "Correct !!";
        String I_ans = "Incorrect !!! The correct answer is: 32";

        if (q2.equals(data2)) {
            return C_ans;
        } else {
            return I_ans;
        }
    }

    public String getQ3() {
        String C_ans = "Correct !!";
        String I_ans = "Incorrect !!! The correct answer is: Dublin";

        if (q3.equals(data3)) {
            return C_ans;
        } else {
            return I_ans;
        }
    }

    public String getQ4() {
        String C_ans = "Correct !!";
        String I_ans = "Incorrect !!! The correct answer is: James Joyce";

        if (q4.equals(data4)) {
            return C_ans;
        } else {
            return I_ans;
        }
    }

    public String getQ5() {
        String C_ans = "Correct !!";
        String I_ans = "Incorrect !!! The correct answer is: Ireland Forever";

        if (q5.equals(data5)) {
            return C_ans;
        } else {
            return I_ans;
        }
    }

    public String getQ6() {
        String C_ans = "Correct !!";
        String I_ans = "Incorrect !!! The correct answer is: Easter";

        if (q6.equals(data6)) {
            return C_ans;
        } else {
            return I_ans;
        }
    }

    public String getQ7() {
        String C_ans = "Correct !!";
        String I_ans = "Incorrect !!! The correct answer is: Michael D. Higgins";

        if (q7.equals(data7)) {
            return C_ans;
        } else {
            return I_ans;
        }
    }

    public String getQ8() {
        String C_ans = "Correct !!";
        String I_ans = "Incorrect !!! The correct answer is: Euro";

        if (q8.equals(data8)) {
            return C_ans;
        } else {
            return I_ans;
        }
    }

    public String getQ9() {
        String C_ans = "Correct !!";
        String I_ans = "Incorrect !!! The correct answer is: 7";

        if (q9.equals(data9)) {
            return C_ans;
        } else {
            return I_ans;
        }
    }

    public String getQ10() {
        String C_ans = "Correct !!";
        String I_ans = "Incorrect !!! the correct answer is: Green, White, and Orange";

        if (q10.equals(data10)) {
            return C_ans;
        } else {
            return I_ans;
        }
    }

    /**
     * Setters
     */
    
    // set user name
    public void setName(String name) {
        this.name = name;
    }

//////////////////////////////////////////////////////////////////////////////
    
    // set user selected answers
    public void setData1(String data1) {
        this.data1 = data1;
    }

    public void setData2(String data2) {
        this.data2 = data2;
    }

    public void setData3(String data3) {
        this.data3 = data3;
    }

    public void setData4(String data4) {
        this.data4 = data4;
    }

    public void setData5(String data5) {
        this.data5 = data5;
    }

    public void setData6(String data6) {
        this.data6 = data6;
    }

    public void setData7(String data7) {
        this.data7 = data7;
    }

    public void setData8(String data8) {
        this.data8 = data8;
    }

    public void setData9(String data9) {
        this.data9 = data9;
    }

    public void setData10(String data10) {
        this.data10 = data10;
    }

//////////////////////////////////////////////////////////////////////////////
    
    // set quiz answers
    public void setQ1(String q1) {
        this.q1 = q1;
    }

    public void setQ2(String q2) {
        this.q2 = q2;
    }

    public void setQ3(String q3) {
        this.q3 = q3;
    }

    public void setQ4(String q4) {
        this.q4 = q4;
    }

    public void setQ5(String q5) {
        this.q5 = q5;
    }

    public void setQ6(String q6) {
        this.q6 = q6;
    }

    public void setQ7(String q7) {
        this.q7 = q7;
    }

    public void setQ8(String q8) {
        this.q8 = q8;
    }

    public void setQ9(String q9) {
        this.q9 = q9;
    }

    public void setQ10(String q10) {
        this.q10 = q10;
    }

}
