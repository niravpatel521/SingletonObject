package singletonObject;

import singletonPages.PageOne;
import singletonPages.PageTwo;

public class SuperBaseClass {
    private static PageOne pageOneObject;
    private static PageTwo pageTwoObject;


    public static  PageOne pageOneMethod(){
        if(pageOneObject == null){
            pageOneObject = new PageOne();
        }
        return  pageOneObject;
    }

    public static  PageTwo pageTwoMethod(){
        if(pageTwoObject == null){
            pageTwoObject = new PageTwo();
        }
        return pageTwoObject;
    }

}
