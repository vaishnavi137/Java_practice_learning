1.While loop
Theory:The Java while loop is used to iterate a part of the program repeatedly until the specified Boolean condition is true.

Syntax:while (condition){    
//code to be executed   
I ncrement / decrement statement  
}    

Example:
public class WhileExample {  
public static void main(String[] args) {  
    int i=1;  
    while(i<=10){  
        System.out.println(i);  
    i++;  
    }  
}  
}  

/*************************************************/

2.Do while loop
Theory:Java do-while loop is called an exit control loop. Therefore, unlike while loop and for loop, the do-while check the condition at the end of loop body.

Syntax:
do{    
//code to be executed / loop body  
//update statement   
}while (condition);   

Example:
public class DoWhileExample {    
public static void main(String[] args) {    
    int i=1;    
    do{    
        System.out.println(i);    
    i++;    
    }while(i<=10);    
}    
}   

/********************************************/

3.For loop 
Theory:The Java for loop is used to iterate a part of the program several times. If the number of iteration is fixed, it is recommended to use for loop.

Syntax:
for(initialization; condition; increment/decrement){    
//statement or code to be executed    
}

Example:
public class ForExample {  
public static void main(String[] args) {  
    //Code of Java for loop  
    for(int i=1;i<=10;i++){  
        System.out.println(i);  
    }  
}  
}  

Java for-each Loop
The for-each loop is used to traverse array or collection in Java. It is easier to use than simple for loop because we don't need to increment value and use subscript notation.

Syntax:
for(data_type variable : array_name){    
//code to be executed    
}    

Example:
public class ForEachExample {  
public static void main(String[] args) {  
    //Declaring an array  
    int arr[]={12,23,44,56,78};  
    //Printing array using for-each loop  
    for(int i:arr){  
        System.out.println(i);  
    }  
}  
}  

/*************************************/

4.break
Theory:The Java break statement is used to break loop or switch statement. It breaks the current flow of the program at specified condition. In case of inner loop, it breaks only inner loop.
  
Syntax:
jump-statement;    
break;   

eXAMPLE:
public class BreakExample {  
public static void main(String[] args) {  
    //using for loop  
    for(int i=1;i<=10;i++){  
        if(i==5){  
            //breaking the loop  
            break;  
        }  
        System.out.println(i);  
    }  
}  
}  

/**************************************************/

5.Continue
theory:The Java continue statement is used to continue the loop. It continues the current flow of the program and skips the remaining code at the specified condition. In case of an inner loop, it continues the inner loop only.

Syntax:
jump-statement;    
continue;   

Example:
public class ContinueWhileExample {  
public static void main(String[] args) {  
    //while loop  
    int i=1;  
    while(i<=10){  
        if(i==5){  
            //using continue statement  
            i++;  
            continue;//it will skip the rest statement  
        }  
        System.out.println(i);  
        i++;  
    }  
}  
}  




