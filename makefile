all:
	javac *.java

run: RNG.class
	java RNG $(ARGS)

Coder.class: RNG.java
	javac RNG.java

clean: 
	rm *.class