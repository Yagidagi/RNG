all:
	javac *.java

run: Main.class
	@java Main $(ARGS)

clean: 
	rm *.class