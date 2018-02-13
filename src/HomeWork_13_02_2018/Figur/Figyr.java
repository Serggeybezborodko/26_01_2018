package HomeWork_13_02_2018.Figur;

abstract class Figyr {
    private int sideA;
     private int sideB;
    private int sideC;


           public Figyr() {
            }


         public Figyr(int sideA, int sideB, int sideC) {
               this.sideA = sideA;
              this.sideB = sideB;
            this.sideC = sideC;
       }


         public Figyr(int sideA, int sideB) {
           this.sideA = sideA;
            this.sideB = sideB;
         }


          public Figyr(int sideA) {
              this.sideA = sideA;
         }


        public int getSideA() {
            return sideA;
          }


         public void setSideA(int sideA) {
             this.sideA = sideA;
           }


           public int getSideB() {
              return sideB;
          }


       public void setSideB(int sideB) {
             this.sideB = sideB;
        }

       public int getSideC() {
             return sideC;
         }


       public void setSideC(int sideC) {
           this.sideC = sideC;
         }


        abstract void draw();


      abstract void areaCalculation();

}

