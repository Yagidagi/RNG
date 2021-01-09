all:
	javac *.java

run: Main.class
	javac *.java
	java Main $(ARGS)

clean: 
	rm *.class