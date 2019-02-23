
public class CodingbatRecursion1
{
    public int factorial(int n) {
  if(n<=1) return 1;
  else
  return factorial(n-1)*n;
  
}
public int bunnyEars(int bunnies) {
  if(bunnies==0){
    return 0;
  }else{
    return (bunnies*2);
  }
}
public int fibonacci(int n) {
  if(n==1) return 0;
  if(n==0) return 0;
  else
    return (n-1)+(n-2);
  }
public int bunnyEars2(int bunnies) {
    if (bunnies == 0) return 0;
    if (bunnies % 2 == 1) return 2 + bunnyEars2(bunnies - 1);
    return 3 + bunnyEars2(bunnies - 1);
}
public int triangle(int rows) {
    if (rows == 0) return 0;
    return rows + triangle(rows - 1);
}
}
