
#import "RNRiskifiedBeacon.h"
#import "RiskifiedBeacon.h"
#import <React/RCTLog.h>

@implementation RNRiskifiedBeacon

RCT_EXPORT_MODULE()

RCT_EXPORT_METHOD(startBeacon:(NSString *)shopName sessionToken:(NSString *)token debugInfo:(BOOL)enabled)
{
    [RiskifiedBeacon startBeacon:@"cardcash.com" sessionToken:token debugInfo:enabled];
}
    
RCT_EXPORT_METHOD(updateSessionToken:(NSString *)newToken)
{
    [RiskifiedBeacon updateSessionToken:newToken];
}
    
RCT_EXPORT_METHOD(logRequest:(NSURL *)requestUrl)
{
    [RiskifiedBeacon logRequest:requestUrl];
}

RCT_EXPORT_METHOD(logSensitiveDeviceInfo)
{
    [RiskifiedBeacon logSensitiveDeviceInfo];
}

@end
