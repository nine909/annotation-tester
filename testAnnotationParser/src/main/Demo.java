package main;

import annotation.Annotated;
import annotation.TestAnnotationParser;

public class Demo {
    public static void main(String[] args) throws Exception {
        TestAnnotationParser parser = new TestAnnotationParser();
        parser.parse(Annotated.class);
    }
}
