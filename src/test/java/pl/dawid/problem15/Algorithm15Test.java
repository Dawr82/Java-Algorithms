// package pl.dawid.problem15;

// import org.junit.jupiter.api.Test;
// //import org.junit.Test;

// import pl.dawid.problem10.Algorithm10;

// import java.util.HashMap;
// import java.util.Map;

// import static org.junit.jupiter.api.Assertions.*;

// public class Algorithm15Test {

//     @Test
//     public void testPickFromStream() {
//         Integer[] stream = {2, 7, 6, 1};
//         Map<Integer, Integer> occurences = new HashMap<>();

//         for(Integer number : stream){
//             occurences.put(number, 0);
//         }

//         final int ITERATIONS = 1_000_000;
//         final int EXC_OCCUR = ITERATIONS/stream.length;
//         final int EPS = 1000;

//         for(int i = 0; i < ITERATIONS; ++i){
//             Integer picked = (Integer)Algorithm15.pickFromStream(stream);
//             occurences.put(picked, occurences.get(picked) + 1);
//         }

//         int sum = 0;
//         for(Map.Entry<Integer, Integer> entry : occurences.entrySet()){
//             int value = entry.getValue();
//             sum += value;
//             assertTrue((value > EXC_OCCUR - EPS) && (value < EXC_OCCUR + EPS));
//         }
//         assertEquals(sum, ITERATIONS);
//     }
// }