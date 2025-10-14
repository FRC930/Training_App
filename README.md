# Training_App
Basic Java application for training.
- Environment Setup
- Branch Creation
- Variables
- Logic
- Objects
- Object-Oriented Programming
- Properties and Constructors
- Methods

## How to read this easier
Looking at a large wall of monospace programming font text can be very hard on they eyes, and looking at a much easily readable formatted version would be much preferred. Thankfully, this document is written in ***markdown***! Markdown is a language for creating simple documents that can be easily read.

To unlock the full powers of reading this markdown easily, go into Visual Studio Code and *right-click* on this file name in the explorer.

Then, from the dropdown menu, select "Open Preview". You could also have used the shortcut listed by the button in the dropdown, default set to `Ctrl-Shift-V`.

## Environment Setup
1. Setup Environment
 - [Environment Documentation](https://sites.google.com/view/team930programmingdoc/organization/environment)
2. Install GitHub Desktop
 - [Download Website](https://desktop.github.com/download/)
 - Login to GitHub Desktop
 - Clone this repository
3. Install VSCode Extensions
 - Java Run
 - Gradle
4. Update Extensions & Reload
 - Debugger for Java
 - Language Support for Java
 - Project manager for Java

## Create a Branch
1. Open the "Current Branch" menu on the top bar of GitHub Desktop, and select "New Branch"
2. Name this branch
 - We use \<Your First Name\>-branch for our naming. e.g. luke-branch, evan-branch
3. If not already on branch, switch to it on GitHub Desktop
 - On the "Current Branch" menu on the top bar of GitHub Desktop, select <Name>-branch under "Recent branches"

## Variables
1. Open Variables.java (under app/main/java/_training). What do you think this code does?
2. Run the code and see the result.
 - The code starts with "int" myNum and "int" myOtherNum. "int" stands for *integer*, which is a number without a decimal.
 - It then states the names after "int," which in this case are myNum and myOtherNum. The equals sign means it is this variable to something, saying it is equal to a value. This code sets the numbers to 1 and 2.
 - After this, it makes one last number, myFinalNum. It sets this number equal to the sum of myNum and myOtherNum. Thinking back on Algebra (ugh), you can substitute 1 for myNum and 2 for myOtherNum in the myFinalNum statement. It will become myFinalNum = 1 + 2.
 - The computer then prints the result!
3. Modify the code to include a third number that is multiplied by myFinalNum.
 - Hint: The sign for multiplication in Java is `*`, and Java follows Order of Operations (Parentheses, Multiplication / Division, Addition / Subtraction)
 - The solution is found in VariablesSolution.java

### Variable Types
#### String
 1. Add `String myText = "Hello!";` and `String myOtherText = "Again!";` to Variables.java.
 - A string represents a "string of characters." In other words, string is text!
 2. Add the two strings together into a new variable, myFinalText, and print it out.
 - `String myFinalText = myText + myOtherText;`
 - `System.out.println(myFinalText);`
 - Does it work?
 - What do you think is happening?
 - Try to fix it!
 <details>
 <summary>Click for Answer!</summary>
 When you are adding the two strings together, it adds "Hello!" and "Again!". There isn't a space inbetween, resulting in "Hello!Again!" You can fix it by adding a space after "Hello! " or before " Again!" View the solution if confused.
 </details>

<!--67!!!!!!!!-->
#### Float
 1. Add `float myDecimal = 2.5f;` and `float mySecondDecimal = 5.0f;` to Variables.java.
 - Float stands for "Floating-point decimal."
 - You must use an f after the number declaration, and it must be a decimal.
 2. Divide `myDecimal` by `mySecondDecimal` and store it in myLastDecimal, and print the output.
 - Hint: To divide in java, use `/`.
 - You should get 0.5, which is 1/2. This is true because 2.5 is half of 5.0.
#### Doubles
 1. Add `double myDoubleDecimal = 6.7;` and `double myOtherDouble = 4.1;`
 - A double is just a "*double*-length" float.
   - This means that doubles will be twice as accurate, but also require twice as much computer memory.
 - You do not need a suffix for numbers, because doubles are the widely accepted standard for numbers.
 2. Divide `myDoubleDecimal` by `myOtherDouble`, storing the result in myFinalDouble. Print the final output.

#### Bool
 1. Add the following code to Variables.java and run it.
 ```java
 boolean ateBreakfast = true;
 boolean ateLunch = true;
 boolean ateDinner = false;

 System.out.println(ateBreakfast && ateLunch);
 System.out.println(ateLunch && ateDinner);
 ```
 - A boolean is essentially a yes or no, but instead of yes, we say "true", and instead of no, we say "false".
 - The `&&` means "and." Look through the code. It prints out ateBreakfast && ateLunch, or ateBreakfast *and* ateLunch. We ate both of them (they both are true), so it will say true. Meanwhile, ateLunch is true, but ateDinner is *not*, so on the second print, we did *not* eat lunch and eat dinner.
 - We will talk more about booleans and logic soon.

## Logic
### If statements
 1. Read through IfStatement.java, and run it.
 - The `||` operator means "or."

<details>
<summary>Click for explanation</summary>
IfStatement.java declares 4 booleans. It then goes into an if statement, which checks if something is true, and then runs code. Inside the parentheses, it has a set of conditions. The first is if you brushedTeeth or tookMints. You brushedTeeth, and didn't take mints, but this is an or, which means only one has to be true. The second condition is if you did your homework, which is false. The third is preparedForRobotics, which is true. Because didHomeWork is false, you aren't preparedForRobotics and *didHomework*, so you can't go (the if statement isn't run).  
</details>
 2. Modify the if statement's ending to the code below.

```java
if ( (brushedTeeth || tookMints) && didHomework && preparedForRobotics) {
    System.out.println("I can go to robotics tonight!");
} else {
    System.out.println("I can't go to robotics yet.");
}
```
 - Now the code is skipping over the if statement, but "else" means otherwise. So, if I did all of my stuff, then I can go, *otherwise*, I can't go.
 - Try to add another if statement to check for each boolean, and see if it's *not* true.
    - Hint: `!(variable)` = not, reverses the boolean
    - For example, `!true` = false, `!false` = true
    - See the solution in IfStatementSolution.java.
 3. Shorten the code to below.

```java
if ((brushedTeeth || tookMints) && didHomework && preparedForRobotics) {
    System.out.println("I can go to robotics tonight!");
} else if (!(brushedTeeth || tookMints)) {
    System.out.println("Gotta freshen up!");
} else if (!didHomework) {
    System.out.println("Oh darn, I gotta do my Math homework!");
} else if (!preparedForRobotics) {
    System.out.println("Oop, I need to finish finding my sponsors!");
}
```
 - Read the code over, substituting in your mind "otherwise" in place of "else."
 - It should make some sense. If I did everything, then I can go. Otherwise, if I didn't (not) freshen up, I need to do that. Otherwise, if I need to finish my homework, I will do that. Otherwise, if I am not prepared for robotics, I need to get prepared.

### While Loops
 1. Open While.java & run it.
 - You may wonder - How come there are 9 lines printed to the console, when there are only 2 println statements?
 - A while loop is a block of code that will run *forever* until a condition is met. In this example, the condition is `hoursWorked < 8`. So, it will loop forever when you have worked less than 8 hours.
 - Every iteration, it will print how many hours you have worked so far, then you will work 1 hour. (You will add 1 to hoursWorked). You will keep doing this when you have worked less than 8 hours, until you pass it, so you don't need to work anymore.
 2. Change the value 8 in the less-than to 5 and run.
 - How did the result change?
 3. Change the `+` in the for loop when incrementing the hoursWorked into a `-`.
 - Uh oh. The code is going to run forever! Look at the console, then stop the code with the stop sign in the top center of your screen.
 - This happens because evey time the while runs, it will decrement the hoursWorked, so it will never go up and past 8 hours. You will work hours backwards somehow, and eventually you will have worked -613620 hours...
 - Think of this happening on the robot. You accidentally make the robot move forward while the distance to the target is more than 5, but instead of decreasing the distance, you increase it... Not good! You always have to be very careful when writing for loops to make sure it doesn't crash when running.
 4. Add an if statement checking if hoursWorked is less than 1 at the top of the loop, and inside the statement, add this code: `break;`
 - What happens?
 - Ok, so working -1 hours and then stopping is not realistic, but this code does show as a check to make sure that something unrealistic doesn't happen, and prevents it becoming a ***major*** problem.

### For Loops
 1. Open For.java and read through the code.
 - The code for `for` loops looks a little confusing, but it makes sense when you break it down.
     - `for (int i = 0; i < 20; i++) { }` breaks down into:
 ```java
 int i = 0;
 while(i < 20){
    // Code inside for loop here!
    i++;
 }
 ```
 - Yep, a for loop is only a disguised while loop!
 2. Change the value of how much the loop *iterates*.
 - An iteration is one time the loop runs.
 - Going back to the while example, you would want to change the conditional section to change how many times the loop runs. Look between the while example and the for loop, and find where you would see the conditional.
 3. Why use for instead of while?
 - For loops are more compact, because they have the iterator (counter) built in.
 <!--67!!!!!!!!-->
 - With while loops, you need to initialize a variable before the loop, have the conditional statement, and have to remember to increment the variable inside the loop.
 - With for loops, you can just have the declaration, conditional, and increment all together in the statement.
 4. Create a for inside of the existing for.
 - Try showing you are running in quarters of a circle!
 - Remember, 4 is *NOT* less than 4, so it will show you run 0,1,2,3 quarters if you are `i < 4`.
 <details>
 <summary>Click for solution!</summary>
 for(int quarters = 0; quarters < 5; quarters++){
    <br>System.out.println("I ran in " + quarters + " quarters of the " + i + " circle!");
 <br>}
 </details>

 5. Experinment with for loops more.
 - Try making it count backwards! (You will need a greater than in your conditional.)
 - Print the current circle in the quarter loop! (If you have two loops inside eachother.)

## Apply What You Know
 Lets create a handful of math problems and print the results. The point of this task to apply what you have learned so far. To do this, do the following:
 1. Create 4 addition calculations
 - Example: `1 + 2 = 3`
 - There should be three variables created for each number in each calculation
 - One math problem should be done with integers
 - One math problem should be done with floats
 - One math problem should be down with doubles
 - One math problem of your choice
 2. Create 4 subtraction calculations
 - Example: `1 - 2 = -1`
 - There should be three variables created for each number in each calculation
 - One math problem should be done with integers
 - One math problem should be done with floats
 - One math problem should be down with doubles
 - One math problem of your choice
 3. Create 4 multiplication calculations
 - Example: `2 * 2 = 4`
 - There should be three variables created for each number in each calculation
 - One math problem should be done with integers
 - One math problem should be done with floats
 - One math problem should be down with doubles
 - One math problem of your choice
  4. Create 4 division calculations
 - Example: `4 / 2 = 2`
 - There should be three variables created for each number in each calculation
 - One math problem should be done with integers
 - One math problem should be done with floats
 - One math problem should be down with doubles
 - One math problem of your choice

### Reflection
 1. How well did you do?
 - Think about how many attempts it took to get it right.
    - Even the best programmers have to get it wrong multiple times before their code finally works.
    - It's okay if you needed to get help, even when working on the robot, you may need to get help from your sub-leads to get help with a new problem you have never seen before.
 2. Was it annoying to write so much code?
 - 64+ lines for writing 16 problems must be super annoying, and resulting in lots of copy and pasting.
 - There is an easier way to repeat code that we are going to learn now.

## Functions <!-- TODO: Write Machines explanation -->
 1. Open and run Functions.java.
 - What do you notice about the code?
 - What do you notice about the result?
 2. Break down what you see.
 ```
   This tells Java that we want a *function* in our class
   |     This tells Java we won't return anything
   |     |    This is what we name our function
   |     |    |     These parentheses include paramaters. (none)   
   v     v    v     v
 static void printHi(){
    // This is the code we are running
    System.out.println("Hello!");
 }
 ```
 - This breakdown uses unknown language like class, and paramaters, which we will learn later.
 3. Edit the code in the function.
 - Add some other println to the function. Remember, the code should be put in after the first println, but before the ending curly bracet (`}`).
 - Run the code, and see what happens.
 4. Functions make code easier to write and read.
 - Think back on the MathProblems.java you wrote. How could you improve this with functions?
 - You will need to learn one more thing about functions before you can rewrite MathProblems with functions.

### Parameters <!-- TODO: Continue Machines explanation -->
 1. Open Parameters.java, and run it.
 - What is different about the calls (the function name with parentheses) in main?
 - Change some of the numbers in the parentheses of the calls.
 - Look through the `square(int num)` function. What do you think it does?
 2. Change the square function into a multiply function.
 - While this may seem redundant (Why not just use `*`?), it is easy for practice.
 - Add another parameter into the square function, by adding a comma, and then another variable declaration.

<details>
<summary>Click for solution.</summary>
static void square(int num, int num2)
</details>

 - Rename the function by right-clicking on "square" and in the menu, clicking on "Rename Symbol".
 - Update all of the function calls to use this new paramater with a comma.

<details>
<summary>Click for solution.</summary>
<!--67!!!!!!!!-->
multiply(3, 6);
multiply(2, 9);
</details>

 3. Pass in some variables to `multiply()`.
 - Create some `int` variables in main.
 - Pass in the variables to the `multiply()` function, by just saying their name instead of a number. Example: `multiply(myNum,myNum2);`
 4. Try to pass in a decimal number (double or float) to multiply.
 - `multiply(2.3,6.1);`
 - The red squigglies on `multiply` read: `The method multiply(int, int) in the type ParametersSolution is not applicable for the arguments (double, double).` This is basically telling you that multiply *MUST* take in 2 ints, and cannot take in 2 doubles.
 5. Duplicate (copy & paste) multiply, and modify it to take in 2 doubles, and name it `multiplyDecimals`.
 - Try to change the `multiply(2.3,6.1);` into a `multiplyDecimals(2.3,6.1);`.
 4. Problem with functions currently:
 - What if you didn't want to just print out the result, but pass it into another function, or do something else rather than printing?

### Return Values <!-- TODO: Finish Machines explanation -->
 1. Open Return.java, and look through the code.
 - Run the code. What is it doing?
 - The `return` keyword is put at the end of the function running. It is when the function is done running, and it gives a result.
 - You can use the return value like a variable. This means, you can call the function wherever you would use a variable, even storing the return in a variable!
 2. Remove the variables, replacing them with function calls in the code.
 - Call `square(5)` and `square(2)` in place of squareFive and squareTwo in the println statement.
 - Try adding more `square()` calls in code, like another print statement.
 3. Assign the result from a `square()` to a float.
 - Before running, what do you think will happen?
 - Try fixing the function.
    - Remember - the paramater used in the template is a float.

<details>
<summary>Click for solution.</summary>
static float square(float num){
    //code
}
<br>
Turns into...
<br>
static int square(int num){
    //code
}
</details>

## Object-Oriented Programming
### Why do we do OOP?
 1. Open Robots.java.
 - Look through the code. What is it doing?
 2. Drive the robot around some more.
 - Add more actions for the robot through functions, like turn or intake.
 3. Make another robot.
 - Rename the functions for the current robot by adding a label at the end, like 1.
 - Copy the functions, and edit them to specify that a different robot is doing the actions.
 - Rename the new functions so that you can specify which robot is doing what action in the code.
 - Set the speed for this robot, using a **new** integer variable.
 4. Add another action to both of the robots, with its own parameter.
 - An example would be turn, with a "degrees per second" parameter.
 - Create new variables for each of the robots with their turn speed, passed into the new function.
 #### What is the problem with our method currently?
 This code is becoming very hard to maintain! We need to copy and paste quite a lot. This would be incredibly difficult to run multiple robots simultaneously without interference.
 
 We need some other way to create and control multiple robots. Rather than manually creating all of the robots, we may just be able to make a robot factory of sorts, that makes multiple robots with ease. Object-oriented programming allows us to make these factories.
 ### What is it?
 Object-oriented programming is a style of programming used by many modern programmers and programming languages. It is actually the **main** style of coding in Java!
 
 Understanding object-oriented programming may be incredibly dificult at first, but once you start, you will quickly start to realize the benifits of this organization.

 The way object-oriented programming works is by organizing concepts in programming (like a robot, or a calculator) in to an object. These objects are also organized into trees like the one below.
 ```
            [    Computer     ]
           /         |         \
   [Mobile]       [Desktop]  [Calculator]
    /  \             /   \        |
 Phone Tablet     Laptop PC     TI-83
   |                |             |
 iPhone         MS Surface    TI-83 Plus
                                  |
                              TI-83 Plus CE
 ```
 As we can see, there is one overarching object, a computer. There are then classifications below it, such as mobile computer, desktop computer, etc. These classifications also have their own sub-classifications!

 These objects, or **class**ifications are called "Classes" in programming. Computers are a `class`, Desktop computers are a sub-`class` of computers.
 

 <!--ojisjsdijsdjfush;fsduhfsdfdsjafdsfjasdfjsdakfsakfbjdsabfbsdafjsdbafjksdakfbsdabfdskfbjdsabjfbasdbfjsdabfsadjkfbjksdabfdsajkfbdsaj67kbfjsdbfbdas i just had to vent my annoyance at how confusing this has to be hahahaa-->
  
  ## Creating & Instantiating Classes
  1. Open the file `Computer.java` under the directory (folder) `Classes`.

  At the top of this code (line 3), it has the following statement:
  ```java
  public class Computer {
  ```
  Breaking it down word for word, we get:
  - **Public**: Everthing in your Java program can see / use it.
  - **class**: This new thing is going to be a *class*.
  - **Computer** The name of this class is going to be "*Computer*".
  - After these words, the pair of `{}` brackets (one after `Computer` and one at the end of the document, before `public class ComputerMain`) show that all the code within these blocks is a part of our class.

  This is how we define our class, `Computer`. It is fairly simple syntax.

  <details>
  <!--67!!!!!!!!-->
  <summary>Why do we have "public class ComputerMain" at the end of the file?</summary>
  In Java, all functions (which are what you can put code in) must be a part of a class.
  
  We will learn more about these functions, formally called "methods", but for now just understand that we need the function running our code to be in a special class that is marked to run the code.

  You can also look at our previous code in other files to see that they all have classes as well, and the specially marked `public static void main(String[] args) function`.
  </details>

  Creating a new `Computer` is easy; all you need to do is create an new variable.

  1. In the `main` function of the `ComputerMain` class (which will be referred to as just "the main function"), create a new variable of type `Computer`.
  2. On the right side of the equal sign, type: `new Computer();`
  <details>
  <summary>Click for solution.</summary>
  Computer myPC = new Computer();
  </details>

  The variables of a class are called "instances" of the class, and the process of creating an instance is formally called "instantiation".

  Now you can create your own class!
  
  1.  Create a new file in `Classes`. Name it with a captial letter at the start of each word, with no spaces. (CamelCase)
  - This is to be sure that you can properly create the class, as all Java files have to have at least one class in them with the same name as the file.
  2. Create a new class. Name it whatever you want. (This will be *your* class to make any object you want! Try to keep it something more generic, so we can add more specific examples of the class "extending" it.)
  3. Create a second new class. Name it "`[whatever your first class is named]Main`".
  - *Inside the second class*, copy & paste this exact function in.
  ```java
  public static void main(String[] args) {

    }
  ```
  4. Instantiate (create a variable of your class) in the main function you pasted.

  ## Inheritance
  During the explanation of Object Oriented Programming, we included a "tree" of computer and alike things. The idea of "subclasses", which were objects with similar traits to the classes above them, is the soul of inheritance in Java. Inheritance is the idea that classes can be extended to have newer traits, while reusing functions & variables from their parent class.
  
  There are a few specific terms in OOP related to inheritance:
  - **Inherit** or **Extend**: The action of a class taking some traits from another class, while adding its own traits.
  - **Parent**: The class something inherits from.
  - **Children**: All the classes inheriting from a class.
  - **Class Hierarchy**: The entire representation of classes inheriting eachother. (Also known as a class tree)
  - **Substitutability**: The idea that a child class can effectively replace its parent where it is used. (For example, a `Calculator` can still be used as a `Computer` in code, but a `Calculator` has more / different functionality.)

  Inheriting classes is very easy in Java. First, create a new class. Then, after the class name & *before* the `{`, add `extends `[*parent class name*]` `. This should be done in a different / new file than the parent, because you are creating a new class. For example, open `Mobile.java`. On the third line, it shows how extending works syntactically.

  1. Create a new class, inheriting from your already-existing class.
  - The inheritance should make sense, as we will work with it for the remainder of the OOP course.

  ## Fields
  Fields are a fancy name for properties of a class. For example, for a "people" class, a field could be `String name` or `Color eyeColor`. For `Computer`, a field could be `int computationsRun`.
  
  Open `Computer.java`. At the beginning of the class, there is the line `int manufacturedYear;`. This is similar to how we would create variables in code before, except we don't have an equals-sign and the part afterwards. We are just stating what the variable's name and type, without any value in it. This is a field declaration.

  Fields can also be stated like a regular variable, with an equals sign and default value. This is nice to give default values, but later on we'll talk about constructors, which are more useful for setting starting values in objects.

  Fields are different from variables in the way that fields are tied to a specific object. For example, we can have a `Robot` class with a field `int teamNumber`. If we make two robots, `Robot robot1 = new Robot();` and `Robot robot2 = new Robot();`, and set their team numbers, `robot1`'s team number will be different than `robot2`'s team number, even if they're named the same thing.

  1. Add a "computations run" field to `Computer`.
  2. Add at least 2 fields to your custom parent class.

  The way we read & modify the class's fields is through using the class instance's name, followed by a period and then the desired field. For example, to print a `Computer`'s `prevAction` (the `Computer` is named `com`), you would put:
  ```java
  System.out.println(com.prevAction);
  ```
  To manually change `com`'s previous action, you could do:
  ```java
  com.prevAction = "cool thing";
  ```
  There is a major problem with the code block shown above; what if we're using it to change prevAction, even if we haven't done a new action? This problem of being able to access objects' fields and modify them wrongly is fixed with the idea of Encapsulation.

  1. Play around with changing the `Computer` and your parent class's fields externally. Try printing them, modifying them, etc.

  Fields in `Computer` will be existent on `Mobile` objects as well, and same with your two classes. You just won't be able to access these fields in the child classes yet, because we haven't specified that the child classes can access it yet. They still do exist, we just can't use them.

  ## Access Modifiers

  Access modifiers are things that change what parts of the code can see a class's fields. There are three basic ones:
  - `public`: *All* of your Java code can see this field. This doesn't have much use in fields, but we will see it used nearly all the time in methods. It is also seen before `class` in many places.
  - `protected`: Only classes inheriting your class can see this field. This is scarcely used, but can be good to demonstrate simple encapsulation before using methods.
  - `private`: Only the code & methods inside this class can see the variable. This is similar to the default option (nothing), except in the default option you can modify the field anywhere in the same *file*, where with `private` you can only modify the field in the `class`.

  Access modifiers are placed before a variable's type. For example:
  ```java
  public int coolNum;
  ```
  is a public integer of a *really cool number*.
  ```java
  private int notCoolNum;
  ```
  is a private integer of a not-so-cool number.

  1. Fix the fields in `Computer` to be `protected`. (For now!)
  2. Fix the fields in your parent class to be `protected` as well. 

  ## Methods
  1. Open `Computer.java`.

  In short, methods are just functions that are specific to a class object. Methods can be thought of "actions" an object can do. For example, calculators can add or subtract, and people can talk.

  The only thing different between methods and functions is that functions don't need a class; they just do something independt of objects. They may take in or return them, but they don't belong to objects. Methods, on the other hand, are parts of Objects. They need a specific object to be able to work, as they are a part of it. They may be able to read or change parts of the object.

  Because of how Java is **absolutely** Object-Oriented, literally *everything* in Java is an object. This means that all functions also need to be part of objects / classes. This is why we define our functions still inside the class. We will talk about what `static` methods and functions actually are later.

  ### Calling Methods
  To use methods, we use our normal function-calling syntax with an extra prefix: [*variable name*]`.`[*function*]. For example, calling the `add` method on our computer variable (**if the `Computer` variable were named *myPC***) would be `myPC.add(1,2);`.

  <details>
  <summary>Is this related to the periods in System.out.println("Hello!"); ?</summary>
  Yes, these periods in our print command do actually mean we're calling a method of the system class! We'll talk about why we use "System" (the class) directly later, instead of creating a System object.
  
  The reason we use a second period in the "System.out.println" statement is because "out" is similar to a class *inside* of System. Thus, the println method is a method of *out* (for output), which is a class inside "System".
  </details>

  1. In the main function, call the `add` and `subtract` methods on your `Computer`.
  - Remember these functions return values, so you should store them in variables or print them!
  <details>
  <summary>Solution</summary>
  The variable X represents your *Computer* variable. The numbers, variable names, actions, etc. are arbritrary.
  <br><br>
  int mySum = X.add(5,7);
  int mySub = X.sub(mySum, 2);
  System.out.println(mySub);
  </details>

  ### Creating methods

  Inside our `Computer` class, we see the definitions of the two methods `add` and `subtract`. These definitions are incredibly similar to regular function definitions. The only thing they're missing is the `static` part, which differentiates between functions (with `static`) and methods (without `static`).

  Access modifiers (`public`, `private`, `protected`) can also be used on methods, alike fields. We have been using always `public` so that we are able to call the methods from outside the class, but you could also have internal utility functions that are `private`.

  1. Following how `add` and `subtract` were defined in `Computer`, create `multiply` and `divide`.
  2. Call these methods in the main function of `Computer.java` using an instance of the class.

  <details>
  <summary>Solution #1</summary>
  public int multiply(int x, int y) {
    return x * y;
  }

  public double divide (int x, int y) {
    return x / y;
  }
  </details>
  <details>
  <summary>Solution #2</summary>
  Computer x = new Computer();
  <br>
  ...
  <br>
  System.out.println(x.multiply(5,2));
  System.out.println(x.divide(6,7));
  </details>

  1. Add and call your own 3 methods in your parent class.
  - Remember to *call* the methods outside the class, inside of the main function.

  ### Methods in methods

  Methods can be called inside of other methods. The way we would need to do that is put the name of the instance, then a period and the function, right? But, since we're in the definition of the class, we have no idea what the class instance is going to be called!
  
  To counter this, Java provides a default name for the current instance for use in methods. The keyword `this` refers to the current instance a method is running on For example, if we were to add a new method to `Computer` using another method, we could put:
  ```java
  public void printAdd(int x, int y) {
    System.out.println(this.add(x,y));
  }
  ```

  1. In your parent class, add another method that uses one of your previously made methods.
  
  ## Encapsulation & Modifying Fields in Methods
  Even though we learned about the access modifiers, actually using them seems to be fairly silly. We can make the fields private, but then we can't do anything with them yet. Well, when the fields are private, we can still modify them inside of methods in the class!
  
  The syntax for modifying a field inside a method is similar to calling another method within a method.

  1. Open and observe `Classes/Counter.java`'s syntax.
  2. Add value decrement & value doubling methods.

  We can see here, the syntax for getting & modifying a field is similar to how you would do it outside, but using Java's helpful `this` keyword to refer to the class itself.

  ### Why use methods to "hide" variables?
  Return to our previous problem before using methods; any code can just modify variables in any way we want. Using methods and access modifiers to hide variables a bit better helps with this problem, as we can define in our methods how exactly we will modify the variables. An example of this was in our `Counter.java`. We could only increment, decrement, and double our counter. This prevented weird actions such as setting the count to a random number or performing unwanted operations.
  <!--TAHRARAHRAHRHARHARHRARHAHRAHRUSDOFIHDSLKKKKJTW:Jthis must be so hard to understand what is going on, where is going on, how is going on, and why is going on-->

  ### Getters and Setters

  Getters and setters are specific names for methods that perform that exact purpose; they get and set a variable.

  ```java
  private int setMyVar(int n) {
    this.myVar = n;
  }
  public int getMyVar() {
    return this.myVar;
  }
  ```

  Using these types of methods allows you to easily fine-tune control to variables, and allows for checks that the value is legal before setting it.

  1. Change all of the `protected` variables to `private`s in `Computer` and your parent class, and use getters / setters where appropriate. 

