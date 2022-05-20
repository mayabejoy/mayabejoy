package com.capgemini.in.SampleProject;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import org.junit.Before;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameters;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class AppTest2 extends TestCase
{
    
	private List<String> expectedResult;
	private List<String>  messages;


	public AppTest2(List<String> messages, List<String> expectedResult) {
		// TODO Auto-generated constructor stub

		this.expectedResult = expectedResult;
		this.messages = messages;
	}

	@Before
	public void setup() {
		App app = new App();
	}
	
	@Parameters	
	//parameterized collection
	public static Collection collection() {
		return Arrays.asList(new Object[][] {

			{ Arrays.asList(new String[]{"code", "aaagmnrs"}), Arrays.asList(new String[] {"aaagmnrs","code"})},
			{ Arrays.asList(new String[]{"poke", "pkoe","okpe","ekop"}), Arrays.asList(new String[] {"poke"})},
			{ Arrays.asList(new String[]{"aaa", "bbb","ccc"}), Arrays.asList(new String[]{"aaa", "bbb","ccc"})}
			

		});

	}
    @org.junit.Test
    public void test() {

    	System.out.println( messages.get(0) + "\t"+ expectedResult.get(0));
    	assertEquals(App.funWithAnagrams(messages), expectedResult);
    }
    //call funWithAnagrams() set of input

}
