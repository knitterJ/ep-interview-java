In our MultithreadApp class, we created a Thread called thread1 that prints Thread #1 is running when it's started. We used an anonymous Runnable class to create thread1. Now, we want to create a second Thread using a Lambda Expression.
In the MultithreadApp() constructor, initialize thread2 with a new Thread constructor, and pass a Lambda Expression that prints Thread #2 is running. (Hint: Since run() takes 0 parameters, empty parentheses () will be used in front of the arrow like so: () -> ...).

Finally, in startThreads(), call start() on thread2 to run the second process.
Run your program by clicking the Run button below the Terminal. OR navigate to the source code directory with cd ~/workspace/src/main/java/ in the Terminal. Then enter javac Main.java to compile. Finally, enter java Main to run your program.
