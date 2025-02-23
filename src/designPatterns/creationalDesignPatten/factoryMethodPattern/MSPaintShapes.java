package designPatterns.creationalDesignPatten.factoryMethodPattern;

class  MSPaintShapes {
   static  Shapes createShapes(String shapeType){
       if (shapeType==null){
           return null;
       }
       switch (shapeType) {
           case "Square":
               return new Square();


           case "Circle":
               return new Circle();


           case "Hexagon":
               return new Hexagon();

           case "Pentagon":
               return new Pentagon();

           default:
            return null;

       }
   }


    static  Shapes removeShapes(String shapeType){
        if (shapeType==null){
            return null;
        }
        switch (shapeType) {
            case "Square":
                return new Square();


            case "Circle":
                return new Circle();


            case "Hexagon":
                return new Hexagon();

            case "Pentagon":
                return new Pentagon();

            default:
                return null;

        }
    }
}
