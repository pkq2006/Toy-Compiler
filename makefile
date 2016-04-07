all:
	mkdir -p bin
	javac -cp src/Parser/antlr-4.5.3-complete.jar src/*/*.java -d bin
clean:
	rm -rf bin
