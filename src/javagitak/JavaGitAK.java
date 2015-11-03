/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javagitak;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


/**
 *
 * @author kwiatek
 */
public class JavaGitAK {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       JavaGitAK obj = new JavaGitAK();
	obj.run();

  }

  public void run() {

	String csvFile = "src/imionanazwiskaak.csv";
	BufferedReader br = null;
	String line = "";
	String cvsSplitBy = ",";

	try {

		br = new BufferedReader(new FileReader(csvFile));
		while ((line = br.readLine()) != null) {

		        // use comma as separator
			String[] country = line.split(cvsSplitBy);

			System.out.println(" Imie " + country[0] 
                                 + " Nazwisko " + country[1]);

		}

	} catch (FileNotFoundException e) {
	} catch (IOException e) {
	} finally {
		if (br != null) {
			try {
				br.close();
			} catch (IOException e) {
			}
		}
	}

	System.out.println("Done");
  }

}
