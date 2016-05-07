all:
	mkdir -p bin
	javac -cp src/Parser/antlr-4.5.3-complete.jar src/*.java src/*/*.java -d bin
	cp build_in_functions_data.s bin
	cp build_in_functions_text.s bin
clean:
	rm -rf bin
