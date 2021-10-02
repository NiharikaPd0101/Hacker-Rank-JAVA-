import java.io.*;
import java.lang.reflect.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class Add {
    void add(int... numbers) {
        StringBuffer sb = new StringBuffer();
        int sum = 0;
        for (int num : numbers) {
            sb.append(num + "+");
            sum += num;
        }
        sb.setCharAt(sb.length() - 1, '=');
        sb.append(sum);
        System.out.println(sb);
    }
}
