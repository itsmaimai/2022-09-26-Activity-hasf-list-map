public class Person {
    private String name;
    private int age;
    
    public Person(String name, int age) {
    super();
    this.name = name; // <== important line
    this.age = age;  // <== important line
}
    public void setName (String name){
        name = name;
    }
    public String getName (){
        return name;
    }
    public void setAge (int age){
        age = age;
    }
    public int getAge (){
        return age;
    }
       @Override
   public String toString() {
        return ("Name: "+this.getName()+
                    " Age: "+ this.getAge());
   }
}