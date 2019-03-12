
#import "RNReactNativeRiskifiedBeacon.h"
#import "RiskifiedBeacon.h"

@implementation RNReactNativeRiskifiedBeacon

RCT_EXPORT_MODULE()

RCT_EXPORT_METHOD(startBeacon:(NSString *)shopName sessionToken:(NSString *)token debugInfo:(BOOL)enabled)
{
    [RiskifiedBeacon startBeacon:shopName sessionToken:token debugInfo:enabled];
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
