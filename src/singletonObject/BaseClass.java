package singletonObject;

import singletonPages.PageOne;
import singletonPages.PageTwo;

public class BaseClass {

    protected static PageOne pageOneMethod(){
        return  SuperBaseClass.pageOneMethod();
    }

    protected static PageTwo pageTwoMethod(){
        return  SuperBaseClass.pageTwoMethod();
    }

}
