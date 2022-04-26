class Shape
{
length:number;
breadth:number;
constructor(length:number,breadth:number)
   {
     this.length =length;
	 this.breadth=breadth;
   }
   }
   class rectangle extends Shape
   {
   constructor(length:number,breadth:number)
   {
   super(length,breadth);
   }
   show()
   {
   var area=this.length*this.breadth;
   console.log("area of rectangle is :- "+area);
   }
   }
   class Square extends Shape
   {
   constructor(length:number,breadth:number)
   {
   super(length,breadth);
   }
   show()
   {
   var area=this.length*this.length;
  
   console.log("area of square is:- "+area);
   }
   }
   var objrect= new rectangle(10,15);
   var objsquare=new Square(10,10);
   objsquare.show();
   objrect.show();

   