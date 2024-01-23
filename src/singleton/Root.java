package singleton;

public class Root {//singelton

    private static Root rootInstance;//here we will save the instance of the object - the only one

    private Root(String name) {
        System.out.println("hi i am first time created and my name is : " + name);
    }

    //this methods try to create the RootInstance
    public static Root getInstance() {
       // return new singleton.Root();

        if (rootInstance == null) {//if this is first time we are creating the object
            //we need to create it first time
            rootInstance = new Root("first");//this is the only place we create instance
        }
        //not a first time
        return rootInstance;
    }

}
