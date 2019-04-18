package discuss.service;

import discuss.entity.Addr;

public interface AddrService {
    public AddrService getAddr(Addr addr) throws Exception;
    public AddrService getPhone(Addr addr) throws Exception;
}
