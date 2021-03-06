package org.robolectric.util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * Test helper used to record events and assert on the order in which they happen.
 *
 * @deprecated This class will be removed in a forthcoming release.
 */
@Deprecated
public class Transcript {
  private List<String> events = new ArrayList<>();

  /**
   * @deprecated This class will be removed in a forthcoming release.
   */
  @Deprecated
  public void add(String event) {
    events.add(event);
  }

  /**
   * @deprecated This class will be removed in a forthcoming release.
   */
  @Deprecated
  public void assertNoEventsSoFar() {
    assertEquals("Expected no events but got " + events + ".", 0, events.size());
  }

  /**
   * @deprecated This class will be removed in a forthcoming release.
   */
  @Deprecated
  public void assertEventsSoFar(String... expectedEvents) {
    assertEquals(Arrays.asList(expectedEvents), events);
    events.clear();
  }

  /**
   * @deprecated This class will be removed in a forthcoming release.
   */
  @Deprecated
  public void assertEventsInclude(String... expectedEvents) {
    List<String> original = new ArrayList<>(events);
    for (String expectedEvent : expectedEvents) {
      int index = events.indexOf(expectedEvent);
      if (index == -1) {
        assertEquals(Arrays.asList(expectedEvents), original);
      }
      events.subList(0, index + 1).clear();
    }
  }

  /**
   * @deprecated This class will be removed in a forthcoming release.
   */
  @Deprecated
  public void clear() {
    events.clear();
  }

  /**
   * @deprecated This class will be removed in a forthcoming release.
   */
  @Deprecated
  public List<String> getEvents() {
    return events;
  }
}
