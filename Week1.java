public class Week1 {
    //Types: Types cannot be infered by editor, 
    //type must be provided with assignment,
    //Definition, Decleration, and initialization are separated steps in Java
    //
    //Decleration: specification of data Type
    //
    //Initialization: Specification of data value
    //
    // Ex:: int x = 5, double x = 5.5
    //
    //Java uses staticlly typed primitives, types are a promise
    //This means Variable types cannot be changed
    //
    //Java Primitives:
    //Int, Float, Double, Long, Short, Byte, Char, Boolean
    //
    //Non-Primitves:
    //String, Array, Losts, Files< every other object
    //
    //SemiColon required for line break
    //
    //Functions:
    //Type must be provided for functions,cmost components follow the same pattern as python
    //Java Function EX:

    public int HelloWorld(){
        System.out.println("Hello World");
        //println creates new line
        System.out.print("no new line");
        return 5;
    }

    //in Java, visibilty modifiers must be provided for functions
    //In this case the modifier is the word "Public"
    //Public, Private, and Protected all exist
    //expected return type must be provided 
    //essentially this gives types to functions
    //
    //Curly braces must be used to specify functions, indents do not matter
    //Function call: 
        // HelloWorld();
    // System Library, Output stream, and print function must all be referenced to print, hence the System.out.println
    //
    //Java if statement:
    // if (boolean){ 
        //task
    //}
    // else if (boolean) {
        //stuff
    //}
    //
    //Java For loop
    // for (int i = 0; i<10; i ++){
        //repeat 10 times
    //}
    //To build a project, one must first build a class
    //A class is a blueprint defining a new type
        // objects are instants of this class
        //when run, your projects is an object that is an instantiation of said class
    //Every item in an array must be contigous
    public static void main(String[] args){
        int[] arrayOfInts = new int[5];
        System.out.println(arrayOfInts.length);

    }
    //arrays are much more effecient than Python lists, due to being stored in the cache
    //Java also contains ArrayLists, this has all the same methods as python lists
    //ArrayList<int> ListName = new ArrayList<int>();
    // generics <> are a promise that our list will ontain this type
    //scanners works like input in python
    //someWork = myScanner.nextLine();
    // File I/O
    // Scanner fileScanner = newScanner(new File("someTextFile.txt"))
    //file reading:
    //while (fileScan.hasNext()){
        //System.out.println(filescan.nextLine)
    //}
    //
    
    }


