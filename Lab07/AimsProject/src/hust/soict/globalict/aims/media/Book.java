package hust.soict.globalict.aims.media;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.StringTokenizer;
import javax.swing.JOptionPane;
import java.util.List;

public class Book extends Media{


		public Book(String title, String category, float cost,  String contentLength) {
		super(title, category,cost);
		//this.authors = authors;
		this.contentLength = contentLength;
	}
		// TODO Auto-generated constructor stub

		public Book(String title, String category, float cost,  List<String> authors,String contentLength) {
			super(title, category,cost);
			//this.authors = authors;
			this.authors=authors;
			this.contentLength = contentLength;
		}
		public Book(String title, String category, float cost) {
		super(title, category, cost);
		nbMedia++;
		this.id=nbMedia;
		// TODO Auto-generated constructor stub
	}
	public Book(String title, String category) {
		super(title, category);
		nbMedia++;
		this.id=nbMedia;
		// TODO Auto-generated constructor stub
	}
	public Book(String title) {
		super(title);
		nbMedia++;
		this.id=nbMedia;
		// TODO Auto-generated constructor stub
	}
	public Book(String title, String category, float cost,List<String> authors)
	{
		super(title, category, cost);
		this.authors=authors;
		nbMedia++;
		this.id=nbMedia;
	}
		private List<String> authors = new ArrayList<String>();
		private String contentLength;
		String s;
		public String contentLength()
		{
			if(this.contentLength==null) return null;
			else
			{
				
			StringBuffer buffer = new StringBuffer();
			//this.contentLength=JOptionPane.showInputDialog("Please enter the title of the disc");
			/*String a[] = new String[10];
			int i,j=0,k=0;
			for(i=1;i<this.contentLength.length();i++)
			{
				if ((this.contentLength.charAt(i)==' ') || (i==this.contentLength.length()-1))
				{
					a[k]=this.contentLength.substring(j, i);
					if (i==this.contentLength.length()-1) a[k]=this.contentLength.substring(j, i+1);
					k++;
					for(j=i+1;j<this.contentLength.length();j++)
					{
						if (this.contentLength.charAt(j)!=' ')
						{
							i=j;
							break;
						}
					}
					
				}
			
			}*/
			ArrayList<String> arr = new ArrayList<String>();
			StringTokenizer t = new StringTokenizer(this.contentLength);
			while(t.hasMoreTokens())
			{
				arr.add(arr.size(),t.nextToken().toLowerCase());
			}
			Collections.sort(arr);
			String[] arr1 = new String[arr.size()];
			arr.toArray(arr1);
			int[] arr2 = new int[arr.size()];
			int[] arr3 = new int[arr.size()];
			for(int i=0;i<arr1.length;i++)
				for(int j=0;j<arr1[i].length();j++)
				{
					if (Character.isLetter(arr1[i].charAt(j))==false)
					{
						arr1[i]=arr1[i].substring(0, j)+arr1[i].substring(j+1);
					}
				}
			
			for(int i=0;i<arr1.length;i++)
			{
				int k=1;
				for(int j=i+1;j<arr1.length;j++)
				{
					if(arr2[j]!=1)
					{
					if(arr1[i].compareToIgnoreCase(arr1[j])==0)
					{
						arr2[j]=1;
						k++;
					}
					}
				}
				arr3[i]=k;
			}
			
			for(int i=0;i<arr1.length;i++)
			{
				if (arr2[i]!=1)
				{
					buffer.append(arr1[i]);
				    buffer.append(' ');
				    buffer.append(arr3[i]);
				    buffer.append(", ");
				    
				}
			}
			s=buffer.toString();
			return s;
			}
				
		}
		public Book()
		{
			nbMedia++;
			this.id=nbMedia;
		}
		public void addAuthor(String authorName)
		
		{
			int k=0;
			for (int i=0;i<authors.size();i++)
			{
				if(authorName.compareToIgnoreCase(authors.get(i))==0)
				{
					k=1;
					JOptionPane.showMessageDialog(null,"Oops","Author's name is already exist",JOptionPane.ERROR_MESSAGE);
					break;
				}
			
			}
				if(k==0)
				{
					authors.add(authors.size(),authorName);
					JOptionPane.showMessageDialog(null,"OK","Author's name is successfully added",JOptionPane.INFORMATION_MESSAGE);
					
				}
			
		}
		public void removeAuthor(String authorName)
		{
			int k=0;
			for (int i=0;i<authors.size();i++)
			{
				if(authorName.compareToIgnoreCase(authors.get(i))==0)
				{
					k=1;
					authors.remove(i);
					JOptionPane.showMessageDialog(null,"OK","Author's name is successfully removed",JOptionPane.INFORMATION_MESSAGE);
					break;
				}
			
			}
				if(k==0)
				{
					JOptionPane.showMessageDialog(null,"Oops","Author's name is not in the list",JOptionPane.ERROR_MESSAGE);
					
				}
			
			
		}
		public List<String> getAuthors() {
			return authors;
		}
		public void setAuthors(List<String> authors) {
			this.authors = authors;
		}
		public String getContentLength() {
			return contentLength;
		}
		public void setContentLength(String contentLength) {
			this.contentLength = contentLength;
		}
		public String toString()
		{
			StringBuffer a=new StringBuffer();
			for(int i=0;i<this.authors.size();i++)
			{
				a.append(this.authors.get(i));
				a.append(' ');
			}
			
			return "Book - "+"ID "+this.id+" "+this.title+" - "+this.category+" - "+a.toString()+"\n"+
		contentLength()+" - "+": "+this.cost+"$";
			
		}
	}

