# Recursive-SumofNumbers.java
### A method that recursively sums numbers from one to n given as parameters


##### input: 
```
sum(3)
sum(5) 
sum(12)
```
##### output:
```
Sum of numbers :6
Sum of numbers :15
Sum of numbers :78

```
`sum(3)` when call this like <br>
##### Processed from bottom to top

```

sum(3)=3+sum(2)                  -->6  (last step)
---------->sum(2)=2+sum(1)       -->3  (second step)
--------------------->sum(1)=1   -->1  (first step) 
```

                                         
