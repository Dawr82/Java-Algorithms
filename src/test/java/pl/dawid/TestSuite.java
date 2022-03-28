package pl.dawid;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import pl.dawid.problem1.Algorithm1Test;
import pl.dawid.problem10.Algorithm10Test;
import pl.dawid.problem15.Algorithm15Test;
import pl.dawid.problem18.Algorithm18Test;
import pl.dawid.problem2.Algorithm2Test;
import pl.dawid.problem27.Algorithm27Test;
import pl.dawid.problem29.Algorithm29Test;
import pl.dawid.problem292.Algorithm292Test;
import pl.dawid.problem35.Algorithm35Test;
import pl.dawid.problem37.Algorithm37Test;
import pl.dawid.utils.UtilitiesTest;


@RunWith(Suite.class)
@Suite.SuiteClasses({
        Algorithm1Test.class,
        Algorithm2Test.class,
        Algorithm10Test.class,
        Algorithm15Test.class,
        Algorithm18Test.class,
        Algorithm27Test.class,
        Algorithm29Test.class,
        Algorithm35Test.class,
        Algorithm37Test.class,
        Algorithm292Test.class,
        UtilitiesTest.class
})
public class TestSuite {}
