# Result-Reader-For-scalacg

This little program is result reader for scala call graph tool is called "scalcg".

scalacg is a tool that analysis call and called relationship. 
It is a very great tool.
But analysis result have some inconveniences, because result is not very readable format.
So, you could easily change to more readable format by this litte program.

scalacg website: https://plg.uwaterloo.ca/~karim/projects/scalacg/
<br>(once again express my gratitude for Mr.Karim, scalacg is a great tool.)

Please import this project to your compuer by IntelliJ IDEA.
Then, use SBT command as below to run it.
```
sbt run
```

Result Sample:
```
-------------------
ID to Class:

id15 -> test.Hello.C
id11 -> test.Hello.A
id14 -> test.Hello
id16 -> test.Hello.B
id13 -> test.Hello.CallSiteClass
id12 -> java.lang.Object

-------------------
ID to Method:

id5 => test.Hello.B.foo
id7 => test.Hello.A.<init>
id1 => java.lang.Object.<init>
id4 => test.Hello.C.<init>
id3 => test.Hello.main
id6 => test.Hello.B.<init>
id10 => test.Hello.CallSiteClass.callsite
id9 => test.Hello.CallSiteClass.<init>
id8 => test.Hello.<init>
id2 => test.Hello.CallSiteClass.receiver

-------------------
Caller to Callee:

test.Hello.C.<init> -> java.lang.Object.<init>
test.Hello.main -> test.Hello.C.<init>
test.Hello.B.<init> -> test.Hello.A.<init>
test.Hello.main -> test.Hello.CallSiteClass.callsite
test.Hello.main -> test.Hello.CallSiteClass.<init>
test.Hello.CallSiteClass.callsite -> test.Hello.B.foo
test.Hello.A.<init> -> java.lang.Object.<init>
test.Hello.CallSiteClass.<init> -> java.lang.Object.<init>
test.Hello.main -> test.Hello.B.<init>
test.Hello.CallSiteClass.callsite -> test.Hello.CallSiteClass.receiver
test.Hello.main -> test.Hello.A.<init>
test.Hello.<init> -> java.lang.Object.<init>
```
