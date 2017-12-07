public class Test {

    @Test
    public void testPushAndPop() {
        LinkListStack<Integer> st = new LinkListStack<>();
        st.push(52);
        st.push(40);
        st.push(30);
        assertEquals("190 70 50", st.toString());
        assertEquals(190, (int) st.pop());
        assertEquals("70 50", st.toString());
}
