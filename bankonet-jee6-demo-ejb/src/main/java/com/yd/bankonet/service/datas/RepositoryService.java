package com.yd.bankonet.service.datas;

import javax.ejb.Local;
import javax.ejb.Remote;

/**
 * Created by ydechmi on 18/02/2015.
 *
 */
@Remote
@Local
public interface RepositoryService {

    /**
     * Loading data into database
     */
    public void loadData();
}
