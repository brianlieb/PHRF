package org.seasailing.db;

import org.junit.Test;

import static junit.framework.TestCase.assertTrue;

public class QueryRepoTest {

    @Test
    public void GetAllActiveBoatsTest() {
        assertTrue(QueryRepo.getAllActiveBoats.get().size() > 0);
    }

}
