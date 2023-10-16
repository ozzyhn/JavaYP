import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Writer;
import java.net.URI;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class MainClass
{
	public static void main(String[] args)
	{
		// dosya satır 1
		// dosya satır 2
		// türkçe karakter
		try
		{
			// ornek1();
			// ornek2();
			// ornek3();
			// ornek5();
			// ornek7();
			ornek8();
		}
		catch (Exception e)
		{
		}
	}

	private static void ornek9() throws IOException
	{
		// string pool
		java.io.File file = new File(URI.create("file:/home/numan/Desktop/dosya.txt"));
		FileReader reader = new FileReader(file);
		BufferedReader bufferedReader = new BufferedReader(reader);
		StringBuilder builder = new StringBuilder();
		// StringBuffer // aynısının thread safe olanı
		while (bufferedReader.ready())
		{
			// sonuc += bufferedReader.readLine();
			builder.append(bufferedReader.readLine()).append("\n");
		}
		bufferedReader.close();
		System.err.println(builder.toString());
	}

	private static void ornek8() throws IOException
	{
		Path path = Path.of("/home/numan/Desktop/dosya.txt");
		String text = "\nyeni dosya içeriği\niçerik 2. satır";
		// openoption vermezsem eziyor
		// dosya yoksa hata alırız
		Files.writeString(path, text, Charset.forName("UTF-8"), StandardOpenOption.APPEND);
		ornek5();
	}

	private static void ornek7() throws IOException
	{
		java.io.File file = new File(URI.create("file:/home/numan/Desktop/dosya.txt"));
		// uzerine ekleme ornegi, true olunca ustune ekliyor
		Writer writer = new FileWriter(file, false);
		BufferedWriter bWriter = new BufferedWriter(writer);
		bWriter.write("deneme \ndosyanın devamı\nbaşka bilgiler çöişüğ");
		// close yapmazsam yazma işlemini bitirmez
		bWriter.close();
		ornek5();
	}

	private static void ornek6() throws IOException
	{
		// stream okuma
		java.io.File file = new File(URI.create("file:/home/numan/Desktop/dosya.txt"));
		FileInputStream stream = new FileInputStream(file);
		// emin olamayacağım için charset yazarım
		InputStreamReader reader = new InputStreamReader(stream, Charset.forName("UTF-8"));
		// StandardCharsets.
		// InputStreamReader reader = new InputStreamReader(stream);
		while (reader.ready())
		{
			System.err.print((char) reader.read());
		}
		stream.close();

	}

	private static void ornek5() throws IOException
	{
		// nonblocking io
//		Path path = Path.of("C:\\dosya\\dosya.txt");
//		String sonuc = java.nio.file.Files.readString(path);
//		System.err.println(sonuc);
		// Files.readAllLines("/home/numan/Desktop/dosya.txt"); // daha mantıklı olabilir
		System.err.print(Files.readString(Path.of("/home/numan/Desktop/dosya.txt")));
	}

	private static void ornek4() throws IOException
	{
		// try with resources, closable interface ini implemenmt etmiş ise
		// java.io.File file = new File("C:\\dosya\\dosya.txt");
		java.io.File file = new File(URI.create("file:/home/numan/Desktop/dosya.txt"));
		try (FileReader reader = new FileReader(file); BufferedReader bufferedReader = new BufferedReader(reader))
		{
			while (bufferedReader.ready())
			{
				System.err.println(bufferedReader.readLine());
			}
		}
		catch (Exception e)
		{
		}
	}

	private static void ornek3() throws IOException
	{
		java.io.File file = new File(URI.create("file:/home/numan/Desktop/dosya.txt"));
		FileReader reader = new FileReader(file);
		BufferedReader bufferedReader = new BufferedReader(reader);
		while (bufferedReader.ready())
		{
			System.err.println(bufferedReader.readLine());
		}
		bufferedReader.close();
	}

	private static void ornek2() throws IOException
	{
		java.io.File file = new File(URI.create("file:/home/numan/Desktop/dosya.txt"));
		FileReader reader = new FileReader(file);
		while (reader.ready())
		{
			// char[] cbuf = new char[(int) (file.length() / 5)];
			char[] cbuf = new char[77];
			reader.read(cbuf);
//			System.err.print(cbuf);
			for (int i = 0; i < cbuf.length; i++)
			{
				System.err.print(cbuf[i]);
			}
		}
		reader.close();
	}

	private static void ornek1() throws IOException // maksat diğer hataları da kapsamış olmak
	{
		// uri ile verilebilir
		// java.io.File file = new File("C:\\dosya\\dosya.txt");
		java.io.File file = new File(URI.create("file:/home/numan/Desktop/dosya.txt"));
		FileReader reader = new FileReader(file);
		System.err.print("<");
		while (reader.ready())
		{
			System.err.print((char) reader.read());
		}
		System.err.print(">");
	}
}
