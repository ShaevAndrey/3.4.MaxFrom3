package ru.job4j.max;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MaxNewTest {
@Test
public void whenFirstLessSecondLessTridr() {
    MaxNew maxim = new MaxNew();
    int result = maxim.maxNew(1, 2, 3);
    assertThat(result, is(3));
}
}