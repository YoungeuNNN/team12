package controllers;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JTextPane;
import javax.swing.text.BadLocationException;
import javax.swing.text.Document;
import javax.swing.text.Element;
import javax.swing.text.StyleConstants;
import javax.swing.text.Utilities;


public class Merge_control {
	
		
	
		
	public Merge_control(JTextPane first, JTextPane second,int pos,int det){
		Document doc1 = first.getStyledDocument();
		Document doc2 = second.getStyledDocument();
		
		Element root1 = doc1.getDefaultRootElement();
		Element root2 = doc2.getDefaultRootElement();
	
		ArrayList<String> repLine = new ArrayList<String>();
		int lineNum = getLineCount(first,pos);	
	}
	
	public void MergetoLeft(Element root1, Element root2,int lineNum) {
		Element text1 = root1.getElement(lineNum+1);//linenum에 맞게 추출되는지 확인 
		Color colr = StyleConstants.getBackground(text1.getAttributes()); //color제대로 뽑히는지 확인
		
		int count = 0;
		
		int start1=text1.getStartOffset(), end1=text1.getEndOffset();
		int start2=0, end2=0;
	
		
		
		//end1 = root1.getEndOffset();
			
		//lineElem = elem.getElement(lineCount);
		
	}
	
	
	public int getLineCount(JTextPane textPane, int pos)
	{
		int lineCount = (pos==0) ? 1 : 0;
        try {
            int offs=pos;
            while( offs>0) {
                offs=Utilities.getRowStart(textPane,offs)-1; // 오프셋으로 로우스타트 알 수 있음
                lineCount++;
            }
        } catch (BadLocationException e) {
            e.printStackTrace();
        }
        System.out.println("라인넘버는" + lineCount);
        return lineCount;
        //line rn(row number) = 클릭된줄넘버 저장 
        
	}

	public int getLineCount(JTextPane textPane){ 
        int lineCount=0;
        Scanner sc=new Scanner(textPane.getText());
        while(sc.hasNextLine()){
            String line = sc.nextLine(); 
            lineCount++;
       }
        System.out.println("라인넘버는" + lineCount);
        return lineCount;
    }
	
	public boolean validColor(Color colr) {
		if((colr== Color.YELLOW) || (colr== Color.ORANGE) ||(colr== Color.GRAY))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}
