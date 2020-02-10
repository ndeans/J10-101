readme for us.deans.javastudy.support

LogPrinter - designed as a Singleton pattern offering log services as static methods and intended to be a simple alternative to the Core Java logging system.

Access Modifier for LogPrinter's constructor is protected = so accessible by the class, it's sub-classes and any other clasess inside the package. 
So I'm not sure what the advantage is. Why not make it private?

Just made it private... makes no difference to operation.



 

Singleton with static methods? is that a stupid compromise? ...like a mullet? Couldn't I just use a static class to essentially do the same thing?






