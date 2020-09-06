package com.gmail.ksenzhuk_maksim.lesson4.task3;

class TriangleService {

    //find & return array of equilateral triangles
    Triangle[] findEquilateral (Triangle [] triangles) {
        int counter = 0;
        for (Triangle triangle:triangles) {
            if (triangle instanceof EquilateralTriangle) {
                counter++;
            }
        }
        Triangle[]equilateralTriangles = new Triangle[counter];
        for (int i = 0; i < equilateralTriangles.length;) {
            for (int j = 0; j < triangles.length; j++) {
                if (triangles[j] instanceof EquilateralTriangle) {
                    equilateralTriangles[i] = triangles[j];
                    i++;
                    if (i >= equilateralTriangles.length) break;
                }
            }
        }
        return equilateralTriangles;
        }

    //find & return array of isosceles triangles
    Triangle[] findIsosceles (Triangle [] triangles) {
        int counter = 0;
        for (Triangle triangle : triangles) {
            if (triangle instanceof IsoscelesTriangle) {
                counter++;
            }
        }
        Triangle[] isoscelesTriangles = new Triangle[counter];
        for (int i = 0; i < isoscelesTriangles.length; i++) {
            for (int j = 0; j < triangles.length; j++) {
                if (triangles[j] instanceof IsoscelesTriangle) {
                    isoscelesTriangles[i] = triangles[j];
                    i++;
                    if (i >= isoscelesTriangles.length) break;
                }
            }
        }
        return isoscelesTriangles;
    }

    //find & return array of rectangular triangles
    Triangle[] findRectangular (Triangle [] triangles) {
        int counter = 0;
        for (Triangle triangle:triangles) {
            if (triangle instanceof RectangularTriangle) {
                counter++;
            }
        }
        Triangle[]rectangularTriangle = new Triangle[counter];
        for (int i = 0; i < rectangularTriangle.length; i++) {
            for (int j = 0; j < triangles.length; j++) {
                if (triangles[j] instanceof RectangularTriangle) {
                    rectangularTriangle[i] = triangles[j];
                    i++;
                    if (i >= rectangularTriangle.length) break;
                }
            }
        }
        return rectangularTriangle;
    }

    //find & return array of random triangles
    Triangle[] findRandom (Triangle [] triangles) {
        int counter = 0;
        for (Triangle triangle:triangles) {
            if (triangle instanceof RandomTriangle) {
                counter++;
            }
        }
        Triangle[]randomTriangle = new Triangle[counter];
        for (int i = 0; i < randomTriangle.length; i++) {
            for (int j = 0; j < triangles.length; j++) {
                if (triangles[j] instanceof RandomTriangle) {
                    randomTriangle[i] = triangles[j];
                    i++;
                    if (i >= randomTriangle.length) break;
                }
            }
        }
        return randomTriangle;
    }

    double findMinByPerimeter (Triangle[] triangles) {
        double minPerimeter = triangles[0].findPerimeterOfTriangle();
        for (int i = 1; i < triangles.length; i++) {
            if (minPerimeter > triangles[i].findPerimeterOfTriangle()) {
                minPerimeter = triangles[i].findPerimeterOfTriangle();
            }
        }
        return minPerimeter;
    }

    double findMaxByPerimeter (Triangle[] triangles) {
        double maxPerimeter = triangles[0].findPerimeterOfTriangle();
        for (int i = 1; i < triangles.length; i++) {
            if (maxPerimeter < triangles[i].findPerimeterOfTriangle()) {
                maxPerimeter = triangles[i].findPerimeterOfTriangle();
            }
        }
        return maxPerimeter;
    }

    double findMinByArea (Triangle[] triangles) {
        double minArea = triangles[0].findAreaOfTriangle();
        for (int i = 1; i < triangles.length; i++) {
            if (minArea > triangles[i].findAreaOfTriangle()){
                minArea = triangles[i].findAreaOfTriangle();
            }
        }
        return minArea;
    }

    double findMaxByArea (Triangle[] triangles) {
        double maxArea = triangles[0].findAreaOfTriangle();
        for (int i = 0; i < triangles.length; i++) {
            if (maxArea < triangles[i].findAreaOfTriangle()){
                maxArea = triangles[i].findAreaOfTriangle();
            }
        }
        return maxArea;
    }
}
