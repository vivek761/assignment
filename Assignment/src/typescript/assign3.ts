class Circle
{

radius:number;
distance:number;
constructor(radius:number,distance:number)
{
this.radius=radius;
this.distance=distance;
}
show()
{
var pi=3.14;

var circum=2*pi*this.radius;

var i=this.distance/circum;
var spin=Math.floor(i);

console.log("number of spin = "+spin);
}
}
var obj=new Circle(10,200);
obj.show();