Installation steps:

1. Set up Linux environment:

    * Install Oracle JDK 7
    
        ```
        sudo add-apt-repository ppa:webupd8team/java
        sudo apt-get update
        sudo apt-get install oracle-java7-installer
        ```
    
    * Install git
   
        ```
        sudo apt-get git maven
        ```

2. Get Eclipse Modeling Kepler (for Linux 64-bit) from http://www.eclipse.org/

    * Install the Xtext SDK from the Kepler update site:
    * Add the EMF-IncQuery integration update site:
      <http://download.eclipse.org/incquery/updates/integration>
    * Install EMF-IncQuery SDK 0.8.

3. Get the sources of the EMF-IncQuery solution for the imdb case:

    ```
    git clone https://anonymous@git.inf.mit.bme.hu/r/projects/viatra/ttc14-eiq
    ```

4. Inspecting the code.
   a. Import projects into Eclipse.

5. Building the solution.
   a. Open a terminal and navigate to the `ttc14-imdb` directory in the repository.
   b. Use ./build.sh to build the project.

5. Configuration.
   a. The default configuration is stored in the `config.sh` script.
      To override the default configuration, add a `config-override.sh` file with the desired values, e.g.

      ```
      export sizes="1000 2000"
      ```

6. Generation.
   a. Use the ./generate-all.sh script to generate the synthetic models.
      This generates the models according to the sizes defined in the configuration files.
   b. Use the ./benchmark.sh script to run the transformation on both the synthetic and the real data set.

7. The transformed models are not save by default. To save them, set the value of the `save` variable to true:
   Go to the `config-override.sh` file and add `export save=true`.