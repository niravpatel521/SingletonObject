package singletonTest;

import singletonObject.BaseClass;
import singletonObject.SuperBaseClass;

public class TestOne extends BaseClass {

    public static void main(String[] args) {
        pageOneMethod().methodFromPageOne();
        //same as above
        SuperBaseClass.pageOneMethod().methodFromPageOne();

        pageTwoMethod().methodFromPageTwo();
        //same as above
        SuperBaseClass.pageTwoMethod().methodFromPageTwo();

    }

}
