https://app.pluralsight.com/course-player?clipId=56b04312-f174-4e20-a22b-1f4ef9b4aa6f

Java: Using Lambda Expressions (Interactive) 
By Sarah Holderness

![image](https://user-images.githubusercontent.com/2825912/139942886-8d82987d-e481-4c25-96dc-1b61146502ed.png)


# UsingLambdaExpressions

![](2021-11-02-15-06-19.png)
This is Java Using Lambda Expressions
![](2021-11-02-15-05-31.png)

An Example of a Lambda Expression

List<Integer> items = new ArrayList<>();
items.add(1);
items.add(2);
items.add(3);
items.add(4);

items.forEach(item -> System.out.println(item*item));


![](2021-11-02-15-07-21.png)

It is difficult to understand why you would want to use lambda expressions without understanding how they improved upon the standard for loop.
![](2021-11-02-15-18-17.png)

![](2021-11-02-15-19-49.png)

## Before Java 8 

Using a for-each loop to print a List

List<Integer> Items = new ArrayList<>();
items.add(1);
items.add(2);
items.add(3);
items.add(4);

for(int item: items)
System.out.println(item);

![](2021-11-02-15-23-46.png)
## After Java 8 
Java 8 Introduced .forEach() method. 
Define a method for what you want to do to each item in the list here
![](2021-11-02-15-25-07.png)

 But how to pass a method as an argument?
![](2021-11-02-15-26-59.png)
One way is use Method Reference to forEach() method.

![](2021-11-02-15-27-29.png)
List<Integer> Items = new ArrayList<>();
items.add(1);
items.add(2);
items.add(3);
items.add(4);

items.forEach(System:out::println);

Method References are not flexible. Instead we can pass lambda expression , that will print the square of each Item in the list.

![](2021-11-02-15-30-33.png)

![](2021-11-02-15-31-47.png)
![](2021-11-02-15-32-18.png)
Lambda Expression Syntax
item -> System.out.println(item*item)
Parameter(s) -Arrow-Method body on Right
![](2021-11-02-15-32-44.png)

![](2021-11-02-15-34-59.png)

Lambda Expression - What Does the Arrow Do?
![](2021-11-02-15-36-06.png)

Lambda Expression - Multiline Method enclose curly braces after arrow
![](2021-11-02-15-37-05.png)

![](2021-11-02-15-38-14.png)

![](2021-11-02-15-39-30.png)
![](2021-11-02-15-40-12.png)
Using a Comparator to Sort an Array
![](2021-11-02-15-40-44.png)

![](2021-11-02-15-41-29.png)

![](2021-11-02-15-42-00.png)
Defining a Comparator with a Lambda Expression
![](2021-11-02-15-42-41.png)

![](2021-11-02-15-43-41.png)

![](2021-11-02-15-44-17.png)

![](2021-11-02-15-44-51.png)

![](2021-11-02-15-45-18.png)

![](2021-11-02-15-45-51.png)

https://next.tech/projects/b80fe905-2eec-40a8-8f84-aac0a85d4937?access_token=387DC0DA89D5F560A6A5125CD5F91CE1&internal=false

Challenge: Creating a Lambda Expression
![](2021-11-02-15-56-21.png)

![](2021-11-02-15-47-40.png)

![](2021-11-02-15-55-13.png)

Challenge: Multi-line Lambdas

https://next.tech/projects/e616e1dc-055a-424c-8d4f-2fbfe3c06ed7?access_token=DBB5123A9245B065267683AFDAB2E39F&internal=false



