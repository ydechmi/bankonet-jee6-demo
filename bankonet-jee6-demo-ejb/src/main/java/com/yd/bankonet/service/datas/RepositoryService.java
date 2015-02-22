package com.yd.bankonet.service.datas;

import javax.ejb.Remote;

/**
 * Created by ydechmi on 18/02/2015.
 *
 */
@Remote
public interface RepositoryService {

    /**
     * Loading data into database
     */
    public void loadData();
}
